package br.com.adtech.service.impl;

import br.com.adtech.data.NasaApproach;
import br.com.adtech.data.NasaDTO;
import br.com.adtech.data.NasaEarthObjects;
import br.com.adtech.data.NasaFields;
import br.com.adtech.service.AdtechService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class DefaultAdtechService  implements AdtechService {

    @Autowired
    private RestTemplate restTemplate;
    private static final Logger LOG = LoggerFactory.getLogger(DefaultAdtechService.class.getName());
    @Value("${nasa.url.feed}")
    private  String V1;
    @Value("${nasa.url.feed.v2}")
    private String V2;
    @Value("${nasa.url.feed.v3}")
    private String V3;

    public NasaDTO getAsteroidInformation(Date dateInitial, String datefinal) {


        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(V1).append(convertDate(dateInitial)).append(V2).append(datefinal).append(V3);
        NasaDTO nasaDTO = new NasaDTO();

        try
        {
            NasaEarthObjects nasaEarthObjects = restTemplate.getForObject(stringBuilder.toString(),NasaEarthObjects.class);

            if(nasaEarthObjects != null && !CollectionUtils.isEmpty(nasaEarthObjects.getNear_earth_objects()))
            {
                for(List<NasaFields> nasaFields : nasaEarthObjects.getNear_earth_objects().values())
                {
                    for(NasaFields fields : nasaFields)
                    {

                        for(NasaApproach approach : fields.getClose_approach_data())
                        {
                            nasaDTO.setName(fields.getName());
                            nasaDTO.setKilometers_per_hour(approach.getRelative_velocity().getKilometers_per_hour());
                            nasaDTO.setNeo_reference_id(fields.getNeo_reference_id());
                            nasaDTO.setRelative_velocity(approach.getRelative_velocity());
                            nasaDTO.setIs_potentially_hazardous_asteroid(fields.isIs_potentially_hazardous_asteroid());
                            nasaDTO.setOrbiting_body(approach.getOrbiting_body());
                        }
                    }
                }

            }


        }catch (final HttpClientErrorException e)
        {
            LOG.error("Failed to connect in nasa API " + e);

        }
        catch (final ResourceAccessException e)
        {
            LOG.error("Could not connect to Nasa API", e);
        }
        catch (final Exception e)
        {
            LOG.error("Trying to connect at NASA API " + e);
        }

        return nasaDTO;
    }


    protected static final String convertDate (Date date)
    {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
       return dateFormat.format(date);
    }
}

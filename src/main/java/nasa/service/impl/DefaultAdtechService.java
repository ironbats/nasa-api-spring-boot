package nasa.service.impl;

import br.com.adtech.NasaDTO;
import nasa.data.NasaApproach;
import nasa.data.NasaEarthObjects;
import nasa.data.NasaFields;
import nasa.service.AdtechService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.List;

@Service
public class DefaultAdtechService  implements AdtechService {

    @Autowired
    private RestTemplate restTemplate;
    private static final Logger LOG = LoggerFactory.getLogger(DefaultAdtechService.class.getName());
    private static final String V1 = "https://api.nasa.gov/neo/rest/v1/feed?start_date=";
    private static final String V2="&end_date=";
    private static final String V3 ="&api_key=6WgoUqBtHNJL0e1YT8ORBK0P54bJNDJLtPaSBdxu";

    public NasaDTO getAsteroidInformation(Date dateInitial, Date datefinal) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(V1).append(dateInitial).append(V2).append(datefinal).append(V3);
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
}

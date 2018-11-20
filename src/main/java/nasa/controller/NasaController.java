package nasa.controller;

import br.com.adtech.NasaDTO;
import nasa.service.AdtechService;
import nasa.service.impl.DefaultAdtechService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/get-asteroid-information")
public class NasaController {

    @Autowired
    private AdtechService adtechService;

    @GetMapping(value = "/{dateInital}/feed/{dateFinal}")
    @ResponseBody
    public ResponseEntity<NasaDTO> searchAPossibleAsteroid(@PathVariable final Date initialDate,@PathVariable Date finalDate)
    {
        NasaDTO nasaDTO = adtechService.getAsteroidInformation(initialDate,finalDate);

        if(nasaDTO != null)
        {
            return new ResponseEntity<>(nasaDTO,HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }


}

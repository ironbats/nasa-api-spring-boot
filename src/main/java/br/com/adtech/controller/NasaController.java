package br.com.adtech.controller;

import br.com.adtech.data.NasaDTO;
import br.com.adtech.service.AdtechService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

@RestController
@RequestMapping("/asteroid-information")
public class NasaController {

    @Autowired
    private AdtechService adtechService;

    @GetMapping(value = "/data-final",produces = APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public ResponseEntity<NasaDTO> searchAPossibleAsteroid(@RequestParam(required = false) String dateFinal)
    {
        NasaDTO nasaDTO = adtechService.getAsteroidInformation(new Date(),dateFinal);

        if(nasaDTO != null)
        {
            return new ResponseEntity<>(nasaDTO,HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }


}

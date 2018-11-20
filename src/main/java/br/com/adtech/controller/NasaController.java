package br.com.adtech.controller;

import br.com.adtech.data.NasaDTO;
import br.com.adtech.service.AdtechService;
import io.swagger.annotations.*;
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

    @ApiOperation(value = "Will return a possible Asteroid ")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "dateFinal" , value = " Return a format yyyy-MM-dd date case not , will failed",
                    required = true, dataType = "String")
    })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 500, message = "Erro interno"),
            @ApiResponse(code = 404, message = "No asteroid history")
    })
    @GetMapping(path = "/{dateFinal}", produces = APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public ResponseEntity<NasaDTO> searchAPossibleAsteroid(@PathVariable ("dateFinal") String dateFinal)
    {
        NasaDTO nasaDTO = adtechService.getAsteroidInformation(new Date(),dateFinal);

        if(nasaDTO != null)
        {
            return new ResponseEntity<>(nasaDTO,HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }


}

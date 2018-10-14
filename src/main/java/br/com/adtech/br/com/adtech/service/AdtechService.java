package br.com.adtech.br.com.adtech.service;

import br.com.adtech.NasaDTO;

import java.util.Date;

public interface AdtechService {

    /**
     *
     * This method will return just some fields for identify if an asteroid is comming
     * @param dateInitial
     * @param datefinal
     * @return
     */

    NasaDTO getAsteroidInformation(final Date dateInitial, final Date datefinal);
}

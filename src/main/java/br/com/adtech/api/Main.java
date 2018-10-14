package br.com.adtech.api;

import br.com.adtech.br.com.adtech.data.NasaEarthObjects;

public class Main {

	public static void main(String[] args) {
		AdtechConsumer adtechConsumer = new AdtechConsumer();

		NasaEarthObjects obj = adtechConsumer.getApiNasa();

		System.out.println(obj);
	}

}

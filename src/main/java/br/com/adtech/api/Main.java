package br.com.adtech.api;

import nasa.data.NasaEarthObjects;

public class Main {

	public static void main(String[] args) {
		AdtechConsumer adtechConsumer = new AdtechConsumer();

		NasaEarthObjects obj = adtechConsumer.getApiNasa();

		System.out.println(obj);
	}

}

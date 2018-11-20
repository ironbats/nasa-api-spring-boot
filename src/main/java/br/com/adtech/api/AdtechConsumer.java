package br.com.adtech.api;

import nasa.data.NasaEarthObjects;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.client.RestTemplate;


public class AdtechConsumer {
	
	@Autowired
	private RestTemplate restTemplate;
	
	private static final String API_NASA_CONSUMER = "https://api.nasa.gov/neo/rest/v1/feed?start_date=2015-09-07&end_date=2015-09-08&api_key=6WgoUqBtHNJL0e1YT8ORBK0P54bJNDJLtPaSBdxu";
	
	
	public NasaEarthObjects getApiNasa() {

		restTemplate = new RestTemplate();

		NasaEarthObjects nasaDTO1 = restTemplate.getForObject(API_NASA_CONSUMER,NasaEarthObjects.class);



		return nasaDTO1;
	}
	
	

}

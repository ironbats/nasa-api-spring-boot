package br.com.adtech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan(basePackages = {"br.com.adtech.service",
		"br.com.adtech.controller","br.com.adtech.swagger"})
public class AddtechNeasApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddtechNeasApplication.class, args);
		
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}

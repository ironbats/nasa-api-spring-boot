package br.com.adtech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan(basePackages = "br.com.adtech.*")
@EnableAsync
public class AddtechNeasApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddtechNeasApplication.class, args);
		
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}


}

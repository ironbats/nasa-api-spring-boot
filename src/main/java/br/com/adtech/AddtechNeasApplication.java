package br.com.adtech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {" br.com.adtech.nasa"})
public class AddtechNeasApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddtechNeasApplication.class, args);
		
	}
}

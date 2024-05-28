package com.viscaya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class GraficasApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraficasApplication.class, args);
	}
	
   @Bean
   public RestTemplate getRestTemplate() {
      return new RestTemplate();
   }

}

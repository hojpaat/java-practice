package com.example.java_practice;

import com.example.java_practice.service.PokemonService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaPracticeApplication {

	public static void main(String[] args) {

		SpringApplication.run(JavaPracticeApplication.class, args);
		PokemonService.getHttpRequest();
	}

}

package com.example.CandidatosTSE.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example"})
public class CandidatosTSEApplication {

	public static void main(String[] args) {
		SpringApplication.run(CandidatosTSEApplication.class, args);
	}

}

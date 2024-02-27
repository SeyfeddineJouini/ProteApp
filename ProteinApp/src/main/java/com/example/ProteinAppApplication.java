package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example")
public class ProteinAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProteinAppApplication.class, args);
	}
}
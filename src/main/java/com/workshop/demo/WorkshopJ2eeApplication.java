package com.workshop.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class WorkshopJ2eeApplication {
	public static void main(String[] args) {
		SpringApplication.run(WorkshopJ2eeApplication.class, args);
	}
}

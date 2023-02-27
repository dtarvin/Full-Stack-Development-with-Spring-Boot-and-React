package com.tarvin.transformers;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;

@SpringBootApplication
public class TransformersApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(TransformersApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TransformersApplication.class, args);
		logger.info("Transformers Application started");
	}

}

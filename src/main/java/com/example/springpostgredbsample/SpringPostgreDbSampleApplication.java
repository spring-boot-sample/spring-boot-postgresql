package com.example.springpostgredbsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.example.springpostgredbsample")
@EntityScan(basePackages = "com.example.springpostgredbsample.model")
@EnableJpaRepositories("com.example.springpostgredbsample.model")
public class SpringPostgreDbSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPostgreDbSampleApplication.class, args);
	}
}

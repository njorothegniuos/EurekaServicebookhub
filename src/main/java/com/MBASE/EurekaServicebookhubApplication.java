package com.MBASE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaClient
@ComponentScan({"com.MBASE.controller","com.MBASE.model","com.MBASE.repository","com.MBASE.services"})
@SpringBootApplication
public class EurekaServicebookhubApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServicebookhubApplication.class, args);
	}

}

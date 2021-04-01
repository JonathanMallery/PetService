package com.cognixia.jump.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class PetServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetServiceApplication.class, args);
	}

}
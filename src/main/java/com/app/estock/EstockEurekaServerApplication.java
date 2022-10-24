package com.app.estock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EstockEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstockEurekaServerApplication.class, args);
	}

}

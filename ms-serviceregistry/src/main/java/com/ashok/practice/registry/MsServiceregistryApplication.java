package com.ashok.practice.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MsServiceregistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsServiceregistryApplication.class, args);
	}

}

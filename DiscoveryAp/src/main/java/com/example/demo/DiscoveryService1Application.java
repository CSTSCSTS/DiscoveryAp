package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@RefreshScope
public class DiscoveryService1Application {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryService1Application.class, args);
	}

}

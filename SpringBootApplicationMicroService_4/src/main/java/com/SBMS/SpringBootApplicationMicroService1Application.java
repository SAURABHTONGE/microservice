package com.SBMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class SpringBootApplicationMicroService1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplicationMicroService1Application.class, args);
		
		System.out.println("Application Start!!");
	}

}

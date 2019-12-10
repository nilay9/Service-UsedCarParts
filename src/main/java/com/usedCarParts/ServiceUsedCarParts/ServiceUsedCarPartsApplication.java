package com.usedCarParts.ServiceUsedCarParts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient 
//@ComponentScan(basePackages="com.usedCarParts.ServiceUsedCarParts.Controller")
public class ServiceUsedCarPartsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceUsedCarPartsApplication.class, args);
	}

}

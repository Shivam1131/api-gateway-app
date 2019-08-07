package com.example.eurekaclient.eurekaclientstudent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientStudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientStudentApplication.class, args);
	}

}

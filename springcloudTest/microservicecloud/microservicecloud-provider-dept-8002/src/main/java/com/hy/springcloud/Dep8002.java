package com.hy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class Dep8002 {
	
	public static void main(String[] args) {
		SpringApplication.run(Dep8002.class, args);
	}

}

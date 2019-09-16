package com.hy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.hy.springcloud"})
@ComponentScan("com.hy.springcloud")
public class UserConsumer802_feign {
	  public static void main(String[] args) {
	       SpringApplication.run(UserConsumer802_feign.class,args);
	    }

}

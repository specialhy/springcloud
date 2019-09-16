package com.hy.cloud.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hy.springcloud.entities.User;
import com.hy.springcloud.service.DeptClientaservice;

@RestController
public class UserController {
	
	//private static final String REST_URL_PREFIX = "http:localhost:8001";
	private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-PROVIDER-DEPT";
	
	@Autowired
	private RestTemplate restTemplate;
	
	@SuppressWarnings("unchecked")
	@GetMapping("lists")
	public List<User> list(){
		return restTemplate.getForObject(REST_URL_PREFIX+"/user/list", List.class);
	}
	
    @GetMapping("getUserById/{id}")
	public User getUser(@PathVariable("id") int id){
		return restTemplate.getForObject(REST_URL_PREFIX+"/user/getUserById/"+id, User.class);
	}


	
	

}

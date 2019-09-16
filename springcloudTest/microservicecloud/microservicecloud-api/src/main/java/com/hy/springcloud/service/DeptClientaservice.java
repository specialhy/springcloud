package com.hy.springcloud.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.hy.springcloud.entities.User;


@FeignClient(value="MICROSERVICECLOUD-PROVIDER-DEPT",fallbackFactory=DeptClientServiceFallbackFactory.class)
public interface DeptClientaservice {
	
	    @GetMapping("/user/list")
	    public List<User> findAllUserList();
	    
	    @PostMapping("/user/add")
	    int addUser(User user);
	    
	    @GetMapping("/user/getUserById/{id}")
	    User getUserById(@PathVariable("id") int id);
}

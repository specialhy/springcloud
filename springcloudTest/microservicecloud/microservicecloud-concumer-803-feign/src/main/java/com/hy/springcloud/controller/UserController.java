package com.hy.springcloud.controller;



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

   @Autowired
   private DeptClientaservice deptClientaservice;

   @GetMapping("/user/listxs")
   public List<User> getlist() {
     return deptClientaservice.findAllUserList();
   }
   
   @PostMapping("/user/add")
   public int add(User user) {
     return deptClientaservice.addUser(user);
   }

   
   @GetMapping("/user/getUserById/{id}")
   public User getlist(@PathVariable("id") int id) {
     return deptClientaservice.getUserById(id);
   }


}

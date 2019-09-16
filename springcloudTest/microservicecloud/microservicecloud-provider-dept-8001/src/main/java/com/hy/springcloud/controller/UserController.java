package com.hy.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hy.springcloud.entities.User;
import com.hy.springcloud.service.UserService;


import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/user/list")
    public List<User> findAllUserList() {
      return userService.findAllUserList();
    }
    
    @PostMapping("/user/add")
    public int addUser(User user) {
      return userService.addUser(user);
    }

    
    @GetMapping("/user/getUserById/{id}")
    public User getUserById(@PathVariable("id") int id) {
      return userService.getUserById(id);
    }

    @RequestMapping(value = "/dept/discovery",method = RequestMethod.GET)
    public Object discovery(){
        List<String> list = discoveryClient.getServices();
        List<ServiceInstance> instances = discoveryClient.getInstances("STUDY-SPRINGCLOUD-DEPT");

        for (ServiceInstance element :instances){
            System.out.println(element.getServiceId());
            System.out.println(element.getHost());
            System.out.println(element.getPort());
            System.out.println(element.getUri());
        }
        return this.discoveryClient;

    }

   
}

package com.hy.springcloud.service;


import java.util.List;

import com.hy.springcloud.entities.User;

public interface UserService {

    public List<User> findAllUserList();

    int addUser(User user);
    
    User getUserById(int id);
    

}

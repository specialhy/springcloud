package com.hy.springcloud.mapper;



import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hy.springcloud.entities.User;

@Mapper
public interface UserMapper {

    List<User> findAll();

    int add(User user);
    
    User getUserById(int id);


}

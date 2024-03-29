package com.hy.springcloud.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hy.springcloud.entities.User;
import com.hy.springcloud.mapper.UserMapper;
import com.hy.springcloud.service.UserService;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

	@Override
	public List<User> findAllUserList() {
		return userMapper.findAll();
	}

	@Override
	public int addUser(User user) {
		return userMapper.add(user);
	}

	@Override
	public User getUserById(int id) {
		return userMapper.getUserById(id);
	}



   
}

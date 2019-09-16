package com.hy.springcloud.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.hy.springcloud.entities.User;

import feign.hystrix.FallbackFactory;

@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientaservice> {

	@Override
	public DeptClientaservice create(Throwable cause) {
		// TODO Auto-generated method stub
		return new DeptClientaservice() {
			
			@Override
			public User getUserById(int id) {
				User u = new User();
				u.setName("错误:已停止服务，这是降级处理");
				return u;
			}
			
			@Override
			public List<User> findAllUserList() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int addUser(User user) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
	}

}

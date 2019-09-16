package com.hy.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class MySelfRule {
	
	@Bean
	public IRule myRule() {
		return new RandomRule_hy();//默认是轮询，自定义为随机 每台五次
	}
	

}

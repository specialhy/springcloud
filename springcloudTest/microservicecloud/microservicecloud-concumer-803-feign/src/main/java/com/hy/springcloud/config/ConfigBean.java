package com.hy.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;

@Configuration
public class ConfigBean {
	
	@Bean
	@LoadBalanced//spring cloud Ribbbo是基于Netflix Ribbon实现的客户端负载均衡工具
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	
	/***
	 * 使用自定义的算法
	 * @return
	 */
	@Bean
	public IRule myRule() {
		return new RandomRule();//达到目的，用我们重新选择的随机算法代替默认的轮询
	}

}

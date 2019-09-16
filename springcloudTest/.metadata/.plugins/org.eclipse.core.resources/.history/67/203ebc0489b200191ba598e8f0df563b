package com.hy.myrule;

import java.util.List;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

public class RandomRule_hy extends AbstractLoadBalancerRule {
	
	//total = 0  当等于5的时候，指针才能往下走
	//index = 0 对外提供服务的地址

	private int total = 0;
	private int index = 0;

	@Override
	public Server choose(Object key) {
		ILoadBalancer lb=getLoadBalancer();
		
		if(lb == null) {
			return null;
		}
		Server server = null;
		while(server == null) {
			if(Thread.interrupted()) {
				return null;
			}
			List<Server> upList = lb.getReachableServers();
			List<Server> allList = lb.getAllServers();
			int serverCount = allList.size();
			if(serverCount == 0) {
				return null;
			}
			if(total < 5) {
				server = upList.get(index);
				++total;
			}else {
				total = 0;
				++index;
				if(index >= upList.size()) {
					index = 0;
				}
			}
			if(server == null) {
				return null;
			}
			return server;
		}
		
		
		return null;
	}

	@Override
	public void initWithNiwsConfig(IClientConfig clientConfig) {
		// TODO Auto-generated method stub
		
	}

}

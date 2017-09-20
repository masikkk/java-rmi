package com.masikkk.rmi.spring.server;

//接口实现类
public class HelloSpringServiceImpl implements HelloSpringService{
	@Override
	public String sayHello(String name){
		return "Spring：Hello, " + name;
	}
	
	@Override
	public int sum(int a, int b){
		return a+b;
	}	
	
}

package com.masikkk.rmi.spring.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringServiceMain {
	public static void main(String[] args) {
        new ClassPathXmlApplicationContext("applicationContext-server.xml");
        System.out.println("Spring远程对象绑定成功！");		
	}
}

package com.masikkk.rmi.spring.client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.masikkk.rmi.spring.server.HelloSpringService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext-client.xml"})
public class HelloSpringServiceTest {
	@Autowired
	HelloSpringService helloSpringService; //自动装配rmiClient
	
	@Test
	public void test(){
		System.out.println(helloSpringService.sayHello("masikkk.spring"));
		System.out.println(helloSpringService.sum(10, 5));
	}
}

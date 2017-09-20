package com.masikkk.rmi.client;

import java.rmi.Naming;
import com.masikkk.rmi.server.HelloService;

public class HelloClient {
	public static void main(String[] args) {
		try {
			//在远程对象注册表Registry中查找指定name的对象，并返回远程对象的引用
			HelloService helloService = (HelloService)Naming.lookup("rmi://localhost:8889/HelloService");
			System.out.println(helloService.sayHello("masikkk.com"));
			System.out.println(helloService.sum(2, 3));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
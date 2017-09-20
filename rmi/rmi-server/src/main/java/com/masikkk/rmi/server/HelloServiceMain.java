package com.masikkk.rmi.server;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class HelloServiceMain {
	public static void main(String[] args) {
		try {
			HelloService helloService = new HelloServiceImpl();
			//创建远程对象注册表Registry的实例，被创建的Registry将在指定的端口（默认1099）上侦听到来的请求
			LocateRegistry.createRegistry(8889);
			//将远程服务实现类绑定到指定的RMI地址上，执行这个方法后，相当于发布了RMI服务 
			Naming.bind("rmi://localhost:8889/HelloService", helloService);
			System.out.println("远程对象绑定成功！");
		} catch (MalformedURLException e) {
			System.out.println("发生URL协议异常！");
			e.printStackTrace();
		} catch (AlreadyBoundException e) {
			System.out.println("发生重复绑定对象异常！");
			e.printStackTrace();
		} catch (RemoteException e) {
			System.out.println("创建远程对象发生异常！");
			e.printStackTrace();
		} 
	}
}
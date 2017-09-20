package com.masikkk.rmi.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

//远程接口实现类，必须继承java.rmi.server.UniCastRemoteObject类
public class HelloServiceImpl extends UnicastRemoteObject implements HelloService{
	private static final long serialVersionUID = 4126819767704786465L;

	//如果父类的无参构造函数抛出了异常，则子类的无参构造函数不能省略不写，并且必须抛出父类的异常或父类异常的父类
	public HelloServiceImpl() throws RemoteException {
		super();
	}

	@Override
	public String sayHello(String name){
		return "Hello, " + name;
	}
	
	@Override
	public int sum(int a, int b){
		return a+b;
	}	
	
}

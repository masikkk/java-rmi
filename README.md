# java-jms 
Java RMI远程接口发布与调用实例，及与Spring结合实例。

## 项目介绍
本项目是一个maven多模块项目，简介如下：
- **rmi项目**：多模块maven项目的父项目，不含任何代码，只在pom中规定各子模块依赖项的版本号
- **rmi-server项目**：服务端项目，发布rmi接口
- **rmi-client项目**：客户端项目，调用rmi接口

## 运行方法
- rmi-server项目：Run As->Java Application运行RMI接口发布类HelloServiceMain
- rmi-client项目：Run As->Java Application运行RMI接口调用类HelloClient

## 参考博文
- Java-RMI http://masikkk.com/article/Java-RMI/



package com.atguigu.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private HelloWorld helloWorld;
	
	public UserService() {
		//Spring 来初始化这个Service
		System.out.println("UserService Constructor...");
	}
	
}

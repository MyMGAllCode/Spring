package com.nt.service;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService{

	@Override
	public String sayHello(String name) {
String message="";

	message="Hello "+name+" Welcome to Annotation Based Spring MVC ";
	return message;
	}

}

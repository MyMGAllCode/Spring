package com.nareshit.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nareshit.Service;

public class Test {
	public static void main(String[] args) {
	
		ApplicationContext context=new ClassPathXmlApplicationContext("com/nareshit/xml/myBeans.xml");
		Service service=(Service)context.getBean("serviceObj");
		
		
		service.serviceMethod();
		
	}

}

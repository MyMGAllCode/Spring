package com.nit.aop.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.aop.services.CustomerService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/nit/aop/config/applicationContext.xml");
		
		CustomerService service=context.getBean("cutomerServiceProxy",CustomerService.class);
		System.out.println("Name :"+service.printName()+" Url: "+service.printURL());
try{
	service.printException();
}
catch (InterruptedException e) {
System.out.println( e.getMessage());
}
	}
	

}

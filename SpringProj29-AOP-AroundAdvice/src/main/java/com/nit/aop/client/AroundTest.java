package com.nit.aop.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.aop.services.AccountService;

public class AroundTest {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/nit/aop/cfgs/applicationContext.xml");
		
		AccountService service=context.getBean("aroundProxy",AccountService.class);
		Double  count=service.deposit(102, -1000.0);
		//service.withdraw(101, 500.0);
	}

}

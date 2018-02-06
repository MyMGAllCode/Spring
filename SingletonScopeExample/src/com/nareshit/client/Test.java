package com.nareshit.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nareshit.bean.Address;
import com.nareshit.bean.Student;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/nareshit/cfg/myBeans.xml");
		Student std=context.getBean("student",Student.class);
		Address add=context.getBean("add",Address.class);
		
		
		System.out.println("Student1:"+std.hashCode());
		System.out.println("Address1:"+add.hashCode());
		
		Student std2=context.getBean("student",Student.class);
		Address add2=context.getBean("add",Address.class);

		System.out.println("Student2:"+std2.hashCode());
		System.out.println("Address2:"+add2.hashCode());
		
	}

}

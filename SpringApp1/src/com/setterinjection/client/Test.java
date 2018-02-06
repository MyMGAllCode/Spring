package com.setterinjection.client;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.setterinjection.bean.Address;
import com.setterinjection.bean.Student;

public class Test {
	public static void main(String[] args) {
		String cfgs="/com/setterinjectionexample/config/myBean.xml";
		ClassPathResource resource =new ClassPathResource(cfgs);
		
		XmlBeanFactory factory =new XmlBeanFactory(resource);
		Student std=(Student)factory.getBean("studentObj");
		System.out.println(std.getNo()+","+std.getName());
		Address add =std.getAddress();
		System.out.println(add.getCity()+","+add.getState());
		
	}

}

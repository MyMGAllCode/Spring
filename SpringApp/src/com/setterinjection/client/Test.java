package com.setterinjection.client;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.setterinjection.bean.Address;
import com.setterinjection.bean.Student;

public class Test {
	public static void main(String[] args) {
		String cfgs="/myBean.xml";
		ClassPathResource resource =new ClassPathResource(cfgs);
		
		XmlBeanFactory factory =new XmlBeanFactory(resourse);
		Student std=(Student)factory.getBean(studentObj);
		System.out.println(std.getNo()+","+std.getName());
		Address address =std.getAddress();
		System.out.println(address.getCity()+","+address.getState());
		
	}

}

package com.nareshit.client;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nareshit.bean.Employee;
import com.nareshit.service.EmployeeService;

public class Test {
	public static void main(String[] args) {
		String configFile="com/nareshit/config/myBean.xml";
		ClassPathResource resource=new ClassPathResource(configFile);
		XmlBeanFactory factory=new XmlBeanFactory(resource);
		EmployeeService empService=(EmployeeService)factory.getBean("empService");
		System.out.println("Testing of SearchEmployee(-)");
	
		Employee  emp=empService.serchEmployee(10002);
		if(emp!=null){
			System.out.println("EMP No"+emp.getEmpNo());
			System.out.println("EMP No"+emp.getName());
			System.out.println("EMP No"+emp.getSalary());
		}
		else {
			System.out.println("EMP Not Found");
	}
	}
}

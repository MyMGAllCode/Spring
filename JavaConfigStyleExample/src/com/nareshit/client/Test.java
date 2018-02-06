package com.nareshit.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nareshit.config.MyBeans;
import com.nareshit.domain.Employee;
import com.nareshit.service.EmployeeService;

public class Test {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(com.nareshit.config.MyBeans.class);
	
	EmployeeService employeeService=context.getBean("empService",EmployeeService.class);
	Employee emp=new Employee();
	emp.setSno(1010);
	emp.setName("Dharmendr_Spring");
	emp.setSalary(50000.0);
	boolean flag =employeeService.registerEmployee(emp);
System.out.println(flag);
}
}

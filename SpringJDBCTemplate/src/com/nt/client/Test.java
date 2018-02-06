package com.nt.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.nt.dao.EmployeeDAO;
import com.nt.dao.EmployeeDAOImpl;
import com.nt.domain.Employee;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/nt/cfg/myBeans.xml");
		EmployeeDAO DAO	=context.getBean("employeeDAO",EmployeeDAOImpl.class);
		Employee employee =new Employee();

		employee.setEmpno(10015);
		employee.setName("Dharmedra");
		employee.setSalary(100000);
	
	
	if(DAO.registerEmployee(employee)==1)
		System.out.println("Employee Rgistered ");
	
	else 
		System.out.println("Not Registerd");
	
	
	
		
		
		
		
		
		
		
		
	}

}

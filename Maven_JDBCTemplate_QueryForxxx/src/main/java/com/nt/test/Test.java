package com.nt.test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.dao.EmployeeDAO;
import com.nt.dao.EmployeeDAOImpl;

public class Test {

	public static void main(String[] args) {
	ApplicationContext context =new ClassPathXmlApplicationContext("com/nt/cfg/myBeans.xml");	
EmployeeDAO dao=	context.getBean("employeeDAO",EmployeeDAOImpl.class);


/////////////                RowMapper             //////////////////////
	
	Map<String ,Object> empdetails=dao.getEmployee(112);

	Set<String>keys=empdetails.keySet();
	System.out.println("................................");
	for(String key:keys){
		Object value=empdetails.get(key);
		
		
		System.out.println(key+"---------->"+value);
		
	/////////////////Values Retrieving  byl List  for ALL Employees
		System.out.println("................................");
		
		List<Map<String ,Object>> listofEmp=dao.getEmployees();
		
		
		for(Map<String, Object>emp:listofEmp){
			
			Set<String>keyss= emp.keySet();
			
			for(String kyy:keyss)
			{
				Object value1=emp.get(kyy);
				System.out.println(kyy+"------>"+value1);
				
			}
			System.out.println("................................");
		}
				
				
		
		
		
		
	}
			
			
	
	
	
	
}



	}



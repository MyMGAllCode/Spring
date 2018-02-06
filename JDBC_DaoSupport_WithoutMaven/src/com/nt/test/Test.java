package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.dao.EmployeeDAO;
import com.nt.dao.EmployeeDAOImpl;
import com.nt.domain.Employee;

public class Test {

	public static void main(String[] args) {
	ApplicationContext context =new ClassPathXmlApplicationContext("com/nt/cfg/myBeans.xml");	
EmployeeDAO dao=	context.getBean("employeeDAO",EmployeeDAOImpl.class);


/*int count =dao.register(emp);
if(count==1)
System.out.println("Employe Registration has been registred ");
else 
	System.out.println("Employe has not Registred ");

	*/

System.out.println("Employee Deparment No is:::"+dao.);

}
}

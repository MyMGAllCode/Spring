package com.nt.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.dao.EmployeeDAO;
import com.nt.dao.EmployeeDAOImpl;
import com.nt.domain.Employee;

public class Test {

	public static void main(String[] args) {
	ApplicationContext context =new ClassPathXmlApplicationContext("com/nt/cfg/myBeans.xml");	
EmployeeDAO dao=	context.getBean("employeeDAO",EmployeeDAOImpl.class);

/*List of all 	Emloyees        */
/*List<Employee> emp=dao.getAllEmployee();

for(Employee em:emp){

System.out.println(em.getEmpNo()+"...."+em.getName()+"...."+em.getSalary());



}
*/
System.out.println("---------------- Employees Details For Perticular A employee No. -------------------");
Employee emp=dao.getEmployee(10005);
System.out.println("Emp no:"+emp.getEmpNo()+"Emp Name:"+emp.getName()+"Emp Salary"+emp.getSalary()+"Emp DeptNo:"+emp.getDeptno());

System.out.println("\n------------------  Get All Employees  ------------------\n\n\n");

List<Employee> list=dao.getAllEmployee();

for(Employee emp1:list)
System.out.println("Emp no:"+emp1.getEmpNo()+"Emp Name:"+emp1.getName()+"Emp Salary"+emp1.getSalary()+"Emp DeptNo:"+emp1.getDeptno());


	}

}

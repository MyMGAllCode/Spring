package com.employeeproject.client;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.employeeproject.domain.Employee;
import com.employeeproject.service.EmployeeService;

public class Test {
 public static void main(String[] args) {
String cfgFile="com/employeeproject/cfg/myBeans.xml";	 
Resource resource=new ClassPathResource(cfgFile);
BeanFactory factory=new XmlBeanFactory(resource);
EmployeeService employeeService
=(EmployeeService)factory.getBean("employeeService");
  List<Employee> list=employeeService.searchAllEmployees();
  for(Employee emp:list){
System.out.println(emp.getEmpNo()+" "+emp.getName()+" "+emp.getSalary());	  
  }
 }
}

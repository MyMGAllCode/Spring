package com.nt.dao;

import java.util.List;

import com.nt.domain.Employee;

public interface EmployeeDAO {
	//public int register(Employee employee);
	public List<Employee> getAllEmployee();
	
	public Employee getEmployee(int empno);
	
	
	
	
	

}

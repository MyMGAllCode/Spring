package com.employeeproject.service;

import java.util.List;

import com.employeeproject.dao.EmployeeDAO;
import com.employeeproject.domain.Employee;

public class EmployeeServiceImpl implements
EmployeeService{
private EmployeeDAO employeeDAO;
public void setEmployeeDAO(EmployeeDAO employeeDAO) {
	this.employeeDAO = employeeDAO;
}
public List<Employee> searchAllEmployees() {
	 List<Employee> list=employeeDAO.searchAllEmployees();
		return list;
	}
}

package com.nareshit.service;

import com.nareshit.bean.Employee;
import com.nareshit.dao.EmployeeDAO;

public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDAO employeeDAO;
public void setEmployeeDAO(EmployeeDAO employeeDAO){
	this.employeeDAO=employeeDAO;
	
}
	@Override
	public Employee serchEmployee(int empNo) {
	Employee emp=employeeDAO.searchEmployee(empNo);
			
		return emp;
	}

}


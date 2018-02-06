package com.nt.dao;

import com.nt.domain.Employee;

public interface EmployeeDAO {
	public int registerEmployee(Employee employee);
	
	public int update(int empno ,String name);
	
	public int dalete(int empno );
	
	
	

}

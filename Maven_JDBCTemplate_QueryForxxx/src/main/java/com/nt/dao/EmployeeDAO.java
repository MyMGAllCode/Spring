package com.nt.dao;

import java.util.List;
import java.util.Map;

public interface EmployeeDAO {
	//public int register(Employee employee);
	
	public int getEmpNo(int eno);
	public String getName(int empno);
	public double getSalary(int empno);
	public Map<String ,Object> getEmployee(int empno);
	public List<Map<String ,Object>> getEmployees();
	
	

}

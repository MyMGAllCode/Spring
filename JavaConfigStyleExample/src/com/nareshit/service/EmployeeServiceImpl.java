/**
 * 
 */
package com.nareshit.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nareshit.dao.EmployeeDAO;
import com.nareshit.domain.Employee;

/**
 * @author DKP
 *
 */
@Service("empService")
public class EmployeeServiceImpl implements EmployeeService {
@Autowired
private EmployeeDAO employeeDAO;
	public EmployeeDAO getEmployeeDAO() {
	return employeeDAO;
}
public void setEmployeeDAO(EmployeeDAO employeeDAO) {
	this.employeeDAO = employeeDAO;
}
	public boolean registerEmployee(Employee emp) {
		boolean flag=false;
		try{
			int count =employeeDAO.registerEmployee(emp);
			if(count>0)
					flag=true;
		}catch(SQLException se){
		System.out.println("ExceptionOccure while registering the Employee::"+se.getMessage());
		}
		return flag;
	}

}

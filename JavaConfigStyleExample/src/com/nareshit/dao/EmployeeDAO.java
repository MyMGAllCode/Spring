package com.nareshit.dao;

import java.sql.SQLException;

import com.nareshit.domain.Employee;

public interface EmployeeDAO {
	public int registerEmployee(Employee emp)throws SQLException;

}

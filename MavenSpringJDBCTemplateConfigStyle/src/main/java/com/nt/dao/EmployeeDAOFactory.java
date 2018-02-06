package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeDAOFactory {
	@Autowired
	public static EmployeeDAO getInstance()
	{
		return new EmployeeDAOImpl();
	}

}

package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nrt.domain.Employee;
@Repository("empDao")
public class EmployeeDAOImpl implements EmployeeDAO {
@Autowired
	JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
	return jdbcTemplate;
}

public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}

	public int register(Employee employee) {
		
		return jdbcTemplate.update("insert into Emp values(?,?,?)",employee.getEmpNo(),employee.getName(),employee.getSalary());
	}

}

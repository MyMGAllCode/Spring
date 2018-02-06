package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.nt.domain.Employee;

public class EmployeeRowMapper implements RowMapper<Employee>{
	



	

	public Employee mapRow(ResultSet rs , int rowNo) throws SQLException {
		Employee emp=new Employee();
		emp.setEmpNo(rs.getInt("empno"));
		
		emp.setName(rs.getString("name"));
		emp.setSalary(rs.getDouble("salary"));
		emp.setDeptno(rs.getInt("deptno"));
		return emp;
	}}

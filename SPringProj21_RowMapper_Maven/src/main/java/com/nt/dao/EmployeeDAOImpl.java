package com.nt.dao;


import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.nt.domain.Employee;

/*--------------QueryForXXX() Methods using JDBCDAOSupport---------------------*/ 



public class EmployeeDAOImpl extends JdbcDaoSupport implements EmployeeDAO{
	Employee employee=null;
	public List<Employee> getAllEmployee() {
		
	
String sql="select empno,name,salary,deptno from emp";
		
		EmployeeRowMapper erm=new EmployeeRowMapper();
		List<Employee>list =getJdbcTemplate().query(sql, erm);
		
		
		
		return list ;
	}

	public Employee getEmployee(int empno) {
		
		String sql ="select empno,name,salary,deptno from emp where  empno=?";
		
		EmployeeRowMapper erm=new EmployeeRowMapper();
		List<Employee >list =getJdbcTemplate().query(sql, erm,empno);
		if(list.size()>0)
		{
			employee=list.get(0);
		}
		
		
		
		return employee;
	}


}
	
	

	
	



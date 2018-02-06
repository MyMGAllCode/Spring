package com.nt.dao;


import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/*--------------QueryForXXX() Methods using JDBCDAOSupport---------------------*/ 



public class EmployeeDAOImpl extends JdbcDaoSupport implements EmployeeDAO{
	

	public int getEmpNo(int eno) {
		
		
		return (Integer)getJdbcTemplate().queryForObject("select deptno from emp where empno=?",Integer.class,eno);
	}

	public String getName(int empno) {
		
		return (String)getJdbcTemplate().queryForObject("select name from emp where empno=?",String.class,empno);
	}

	public double getSalary(int empno) {
		// TODO Auto-generated method stub
		return (Double)getJdbcTemplate().queryForObject("select salary from emp where empno=?",Double.class,empno);
	}

	public Map<String, Object> getEmployee(int empno) {
		
		return getJdbcTemplate().queryForMap("select * from emp where empno=?",empno);
	}

	public List<Map<String, Object>> getEmployees() {
		
		return getJdbcTemplate().queryForList("select * from emp ");
	}
	
	
	
		
		

		
		
	}

	/*@Override
	public int register(Employee employee) {
		
		return getNamedParameterJdbcTemplate().update("SELECT EMPNO, NAME,SALARY FROM EMP WHERE EMPNO=:empno", 10001);
	}
	*/
	
	
	

	
	



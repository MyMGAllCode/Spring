package com.nt.dao;


import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

import com.nt.domain.Employee;

/*--------------Implementation of JdbcDaoSupport---------------------*/ 


/*public class EmployeeDAOImpl extends JdbcDaoSupport implements  EmployeeDAO {


	public int register(Employee employee) {
		
		return getJdbcTemplate().update("insert into Emp values(?,?,?)",employee.getEmpNo(),employee.getName(),employee.getSalary());
	
	*/

/*--------------Implementation of SimpleJdbcDaoSupport---------------------*/ 
public class EmployeeDAOImpl extends NamedParameterJdbcDaoSupport implements EmployeeDAO{
	
	
	@Override
	public int  registerEmployeeNamedParameter(Employee emp) {
		
		
		
		String sql="INSERT INTO EMP VALUES( :EMPNO,:NAME,:SALARY)";
		Map<String , Object >map=new HashMap<String,Object>();
		map.put("EMPNO", emp.getEmpNo());
		map.put("NAME", emp.getName());
		map.put("SALARY", emp.getSalary());
		
		
		

		
		return getNamedParameterJdbcTemplate().update(sql,map);
	}

	/*@Override
	public int register(Employee employee) {
		
		return getNamedParameterJdbcTemplate().update("SELECT EMPNO, NAME,SALARY FROM EMP WHERE EMPNO=:empno", 10001);
	}
	*/
	
	
	}

	
	



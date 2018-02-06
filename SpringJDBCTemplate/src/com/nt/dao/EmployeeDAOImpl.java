package com.nt.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;


import com.nt.domain.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
//	@Autowired
JdbcTemplate jdbcTemplate ;


	public int registerEmployee(Employee employee) {
		
		
		String sql="INSERT INTO EMP VALUES(?,?,?)";

	
		
		
		return jdbcTemplate.update(sql,employee.getEmpno(),employee.getName(),employee.getSalary());
		
	}


	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	/*public int update(int empno, String name) {
		String sql="update employee set name='Suresh' where empno=?";
		
		
		return jdbcTemplate.;
	}

	public int dalete(int empno) {
		// TODO Auto-generated method stub
		return 0;
	}*/

}

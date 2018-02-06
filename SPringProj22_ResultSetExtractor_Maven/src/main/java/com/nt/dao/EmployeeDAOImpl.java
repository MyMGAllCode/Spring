package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.nt.domain.Employee;

/*--------------QueryForXXX() Methods using JDBCDAOSupport---------------------*/

public class EmployeeDAOImpl extends JdbcDaoSupport implements EmployeeDAO {
	Employee employee = null;

	public List<Employee> getAllEmployee() {

		String sql = "select empno,name,salary,deptno from emp";

		List<Employee> list = getJdbcTemplate().query(sql,

				///// Annonynoumus Inner Classes

				new ResultSetExtractor<List<Employee>>() {

					List<Employee> list = new ArrayList<Employee>();

					public List<Employee> extractData(ResultSet rs) throws SQLException {

					
						while (rs.next()) {

							Employee emp = new Employee();

							emp.setEmpNo(rs.getInt("empno"));
							emp.setDeptno(rs.getInt("deptno"));
							emp.setName(rs.getNString("name"));
							emp.setSalary(rs.getDouble("salary"));
							list.add(emp);
						}
						return list;
							
					}// End Of Extract Data

				});
		return list;

	}// End of getAllEmployee Data

	public Employee getEmployee(int empno) {

		String sql = "select empno,name,salary,deptno from emp where  empno=" + empno;

		Employee employee = getJdbcTemplate().query(sql,

				///// Annonymous Inner Classe ResultSetExtractor
				new ResultSetExtractor<Employee>() {

					public Employee extractData(ResultSet rs) throws SQLException  {
						Employee emp = null;
						
						if (rs.next()) {

							emp = new Employee();
							emp.setEmpNo(rs.getInt("empno"));
							emp.setDeptno(rs.getInt("deptno"));
							emp.setName(rs.getNString("name"));
							emp.setSalary(rs.getDouble("salary"));

						}
						return emp;
					}// extractData() Method Close

				});
		return employee;
	} // Get eMPLOYEE

}// End OF CLASS

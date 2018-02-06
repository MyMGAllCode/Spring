package com.nareshit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nareshit.constants.SQLConstant;
import com.nareshit.domain.Employee;
@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
@Autowired
private DataSource dataSource; 
private Connection con=null;
int count=0;
	public int registerEmployee(Employee emp) throws SQLException {
		
		try{
		con=dataSource.getConnection();
		PreparedStatement pst=con.prepareStatement(SQLConstant.SQL_REGISTER_EMPLOYEE);
		pst.setInt(1, emp.getSno());
		pst.setString(2, emp.getName());
		pst.setDouble(3, emp.getSalary());
		count=pst.executeUpdate();
		}//try
		finally{
			if(con!=null){
				try{
					con.close();
				}//try
				catch(SQLException se)
				{
				System.out.println("Exception Occured while"+se.getMessage());
				}//catch
			
		}//if
		
			
		}//Finally

			

		return count;
	}
}


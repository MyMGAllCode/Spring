package com.nareshit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nareshit.bean.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
private DataSource dataSource;
Employee emp=null;
	

public void setDataSource(DataSource dataSource) {
	this.dataSource = dataSource;
}

	@Override
	public Employee searchEmployee(int empNo) {
		
		Connection con=null;
		try{
			con=dataSource.getConnection();
					String sql="select * from emp where enpNo=?";
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setInt(1, empNo);
			ResultSet rs=pst.executeQuery();
			emp=new Employee();
			if(rs.next()){
			
				emp.setEmpNo(rs.getInt("enpno"));
				emp.setName(rs.getString("name"));
				emp.setSalary(rs.getDouble("salary"));
			}
		}catch(SQLException sqlException)
		{
			System.out.println("Searching Problem:"+sqlException.getMessage());
			
		}
		finally{
			if(con!=null){
				try{
					con.close();
				}catch(SQLException sqlException){
					System.out.println("Con Closing Prob"+sqlException.getMessage());
				}
			}
		}
		return emp;
	}

}

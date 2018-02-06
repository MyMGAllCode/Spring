package com.employeeproject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.employeeproject.domain.Employee;

public class EmployeeDAOImpl implements
EmployeeDAO{
private DataSource dataSource;
 public List<Employee> searchAllEmployees() {
List<Employee> list=new ArrayList<Employee>(); 
Connection con=null;
try{
con=dataSource.getConnection();
String sql="select empNo,name,salary from employee_details";
PreparedStatement pst=con.prepareStatement(sql);
ResultSet rs=pst.executeQuery();
while(rs.next()){
Employee emp=new Employee();
emp.setEmpNo(rs.getInt("empNo"));
emp.setName(rs.getString("name"));
emp.setSalary(rs.getDouble("salary"));
list.add(emp);
}
}catch(SQLException se){
System.out.println("Exception Occured while searching the employees ::"+se.getMessage());	
}
finally{
	if(con!=null){
  try{
	con.close();
  }catch(SQLException se){
System.out.println("Exception Occured while closing the connection ::"+se.getMessage());	  
  }
	}
}
return list;
	}
public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

}

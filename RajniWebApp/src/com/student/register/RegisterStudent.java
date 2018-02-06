package com.student.register;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterStudent extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// Gathering param values
	/*	System.out.println("Servlet Called");*/
		String fname, lname, email, pwd;
	
		PreparedStatement ps=null, ps1 = null;
		Connection conn=null;
		RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
		fname = req.getParameter("fname");
		lname = req.getParameter("lname");
		email = req.getParameter("email");
		pwd = req.getParameter("password");

		try

		{
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "system", "manager");
			
			
			ps = conn.prepareStatement("select email from student where email=?");
			
			ps.setString(1, email);
			ResultSet rs=ps.executeQuery();
			
			if (!rs.next()) {

				ps1 = conn.prepareStatement("insert into student values(?,?,?,?)");
				ps1.setString(1, fname);
				ps1.setString(2, lname);
				ps1.setString(3, email);
				ps1.setString(4, pwd);
				
				if (1 == ps1.executeUpdate()) {
					req.setAttribute("successMessage", "Welcome :" + fname + " You are Successfully Registered ");
					rd.forward(req, res);
				} else {
					
					req.setAttribute("successMessage",
							"Sorry!!!" + fname + " You are not  Registered. Please Try with Valid Data");
					rd.forward(req, res);
				}
			} else {
				req.setAttribute("successMessage",
						"Sorry!!! :" + fname + " You are Already Registered , Please Try Again with another Email");
				rd.forward(req, res);
			}

	
			
		} catch (ClassNotFoundException ex1) {
			req.setAttribute("successMessage", "Something Database Connectivity Issue :" + ex1.getMessage());
			rd.forward(req, res);
		} catch (SQLException ex2) {
			req.setAttribute("successMessage", "Something Database  Issue :" + ex2.getMessage());
			rd.forward(req, res);
		}
		finally{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				ps.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				ps1.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	@Override
public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req,res);
	}


}

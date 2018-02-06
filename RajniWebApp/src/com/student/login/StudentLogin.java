package com.student.login;

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

public class StudentLogin extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PreparedStatement ps=null;
		Connection conn=null;
		RequestDispatcher rd = req.getRequestDispatcher("/welcome.jsp");
		String email,pwd,fname,lname;
		email=req.getParameter("email");
		pwd=req.getParameter("password");
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "system", "manager");
		ps = conn.prepareStatement("select * from student where email=? and password=?");
		
		ps.setString(1, email);
		ps.setString(2, pwd);
		ResultSet rs=ps.executeQuery();
		
		if (rs.next()) {
		 fname=rs.getString(1);
		 lname=rs.getString(2);
		 req.setAttribute("fname", fname);
		 req.setAttribute("lname", lname);
		 req.setAttribute("email", email);
		 rd.forward(req, res);
	
		}
		else{
			RequestDispatcher rd1 = req.getRequestDispatcher("/index.jsp");
			req.setAttribute("wrongUserOrPwd", "Wrong E-mail or Password. Please Enter Valid User Id and Password");
			rd1.forward(req, res);
		}

	}
	 catch (ClassNotFoundException ex1) {
		req.setAttribute("wrongUserOrPwd", "Something Database Connectivity Issue :" + ex1.getMessage());
		rd.forward(req, res);
	} catch (SQLException ex2) {
		req.setAttribute("wrongUserOrPwd", "Something Database  Issue :" + ex2.getMessage());
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
		
	}
	}
		@Override
		public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			doGet(req,res);//
		}//dopost

	}//Servlet
	



/**
 * 
 */
package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.nt.domain.Login;
import com.nt.service.UserService;

/**
 * @author DKP
 *
 */
public class UserController implements Controller {
	
	UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.mvc.Controller#handleRequest(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String targetView="/WEB-INF/pages/loginForm.jsp";
		String message="Invalid UserName(OR) Password";
		String userId=req.getParameter("userId");
		String password=req.getParameter("pwd");
		if(userId!=null&&userId.trim().length()>0&&password!=null&&password.trim().length()>0){
			Login login=new Login();
			login.setUserId(Integer.parseInt(userId));
			login.setPassword(password);
			login=userService.login(login);
			if(login!=null&&login.getUserRole()!=null){
				message="Welcome:: "+login.getUserName()+" Your Role is :"+login.getUserRole();
				if(login.getUserRole().equals("admin"))
				{
					targetView="/WEB-INF/pages/adminHome.jsp";
				}//if
				else if(login.getUserRole().equals("customer"))
				{
					targetView="/WEB-INF/pages/customerHome.jsp";
				}//if
				else
				{
				message="User Id  And Password  cont be Empty";	
				}//else 
				
			}//if 
			
		}//if

		return new ModelAndView(targetView,"message",message);
	}

}

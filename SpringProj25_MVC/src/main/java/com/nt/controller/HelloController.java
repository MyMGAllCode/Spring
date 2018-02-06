package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.nt.service.HelloService;

public class HelloController implements Controller {

	private HelloService helloService;
	private String message = "";
	private String targetView="/pages/welcome.jsp";

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response )throws Exception {
String name=request.getParameter("name");

if(name!=null&&name.trim().length()>0)
{
	message=helloService.sayHello(name);
	
}//end if
else
{
	message="Hello Guest Welcome to Spring MVC First App !!!";
	
}//end else



ModelAndView modelAndView=new ModelAndView(targetView,"msg",message);
		
		return modelAndView;
	}

	public void setHelloService(HelloService helloService) {
		this.helloService = helloService;
	}

}

package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nt.service.HelloService;

@Controller

public class HelloController {
	@Autowired
	HelloService helloService;
	
	@RequestMapping(value="hello",method=RequestMethod.POST)
public ModelAndView  sayHello(@RequestParam("name") String name)
{
		String message="";
		String targetView="/WEB-INF/pages/hello.jsp";
		
		if(name!=null&&name.trim().length()>0)
		{
			message=helloService.sayHello(name);
		}
		else
		{
			message=helloService.sayHello("GUEST");
			
		}
		
	
	return new org.springframework.web.servlet.ModelAndView(targetView,"message",message);
}

}

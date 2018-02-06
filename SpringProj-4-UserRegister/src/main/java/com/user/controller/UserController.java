package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.user.domain.User;
import com.user.service.UserServiceImpl;

@Controller

public class UserController {
	@Autowired
	private UserServiceImpl userService;
	@RequestMapping(value="register",method=RequestMethod.GET)
	/*public ModelAndView showRegistrationForm(){
		return new ModelAndView( "/WEB-INF/pages/userRegistration.jsp");*/
	public ModelAndView showRegistrationForm(){
		ModelAndView modelAndView=
		new ModelAndView("/WEB-INF/pages/userRegistration.jsp");
		modelAndView.addObject("user",new User());
		return modelAndView;
	}
	String msg="Registration is Failure !!!";
	@RequestMapping(value="registerform",method=RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute("user") User user){
		int count=userService.userRegister(user);
		if(count>0){
			msg="User :"+user.getUserId()+" "+"Registration is successfull !!! ";
			
		}
		
		
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("/WEB-INF/pages/userRegistration.jsp");
		modelAndView.addObject("msg", msg);
		
		return modelAndView;
		
	}

}

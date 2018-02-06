package com.springrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.domain.User;
import com.springrest.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	String response="User not registration Failed";
	@ResponseBody
	@RequestMapping(value="registerUser",method=RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user){
		
		boolean result=userService.registerUser(user);
		if(result){
			response="User :"+user.getUserId()+"is Successful Registered";
		}
		
	
		
		return response;
	}
	

}

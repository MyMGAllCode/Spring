package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.command.LoginUserCommand;
import com.dto.LoginUserDTO;
import com.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	private LoginService service;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String viewLogin(ModelMap map) {
		LoginUserCommand userCommand = new LoginUserCommand();
		map.put("loginCMD", userCommand);
		return new String("login");
	}

	@RequestMapping( method = RequestMethod.POST)
	public String viewnewLogin(ModelMap map, @ModelAttribute("loginCMD") LoginUserCommand command) {
		LoginUserDTO dto = new LoginUserDTO();
		dto.setUserName(command.getUserName());
		dto.setPassword(command.getPassword());
		dto.setDob(command.getDob());
		String msg = service.display(dto);
		map.put("result", msg);
		return "sucess";

	}

}

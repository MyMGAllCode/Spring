package com.nit.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	@RequestMapping(value = "/admin**", method = RequestMethod.GET)
	public ModelAndView adminPage() {
		System.out.println("controller");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("title", "Spring Security Example ");
		modelAndView.addObject("message", "This is protected page");
		modelAndView.setViewName("admin");

		return modelAndView;
	}

}

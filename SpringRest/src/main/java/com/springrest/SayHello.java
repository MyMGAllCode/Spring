package com.springrest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHello {
	@RequestMapping(value="sayhello/{name}",method=RequestMethod.GET)
	@ResponseBody
	
	public String sayHello(@PathVariable("name") String name){
		return "Hello"+name;
	}

}
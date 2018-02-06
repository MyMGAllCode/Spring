package com.searchstudent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.searchstudent.dto.StudentResult;
import com.searchstudent.dto.StudentSearchParam;
import com.searchstudent.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	@RequestMapping(value="/searchstudent",method=RequestMethod.GET)
	public String searchPage(){
		return "/WEB-INF/pages/searchstudent.jsp";
	}
	@RequestMapping(value="searchstudent", method=RequestMethod.POST)
	public ModelAndView searchStudent(@RequestParam("sId") Integer sId,@RequestParam("sName") String sName,@RequestParam("course") String course){
	
	StudentSearchParam  searchParam=new StudentSearchParam();
	searchParam.setsId(sId);
	searchParam.setsName(sName);
	searchParam.setCourse(course);
	
	List<StudentResult> studentResult=studentService.searchStudent(searchParam);
	
	ModelAndView modelAndView =new ModelAndView();
	modelAndView.setViewName("/WEB-INF/pages/studentResult.jsp");
	modelAndView.addObject("studentResult",studentResult);
	return  modelAndView;
		
	}

}

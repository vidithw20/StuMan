package com.example.StuMan.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.StuMan.Domain.Module;
import com.example.StuMan.Domain.Student;
import com.example.StuMan.Service.ModuleService;
import com.example.StuMan.Service.StudentService;



@Controller
@RequestMapping("/")
public class IndexController {
	
	@Autowired
	
	private ModuleService service;
	
@Autowired
	
	private StudentService services;
	
@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index()
	{
		return "index";
	}


	@RequestMapping(value ="/module", method = RequestMethod.GET)
	
	public String viewHomePage(Model model)
	{
		List<Module> listmodule = service.listAll();
		model.addAttribute("listmodule", listmodule);
		return "module";
		
		
	}
	
	@RequestMapping(value ="/student", method = RequestMethod.GET)
	
	public String viewStudentPage(Model model)
	{
		List<Student> liststudent = services.listAll();
		model.addAttribute("liststudent", liststudent);
		return "student";
		
		
	}


}

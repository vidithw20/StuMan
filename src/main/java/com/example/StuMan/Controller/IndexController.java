package com.example.StuMan.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.StuMan.Domain.AllResult;
import com.example.StuMan.Domain.Module;
import com.example.StuMan.Domain.Student;
import com.example.StuMan.Repository.AllResultRepository;
import com.example.StuMan.Service.ModuleService;
import com.example.StuMan.Service.StudentService;



@Controller
@RequestMapping("/")
public class IndexController {
	
	@Autowired
	
	private ModuleService service;
	
@Autowired
	
	private StudentService services;

@Autowired

	private AllResultRepository allresultRepository;




	
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
	
	
@RequestMapping(value ="/result", method = RequestMethod.GET)
	
	public String viewAllResultPage(Model model)
	{
		List<AllResult> li = new ArrayList<>();
		for (Object[] o : allresultRepository.findAllResult()) {
			
			AllResult allresult = new AllResult();
			allresult.setSid(Long.parseLong(String.valueOf(o[0])));
			allresult.setSname((String)o[1]);
			allresult.setSgpa((Double)o[2]);
			li.add(allresult);
			
			
		}
		model.addAttribute("listallresult", li);
		return "allresult";
		
		
	}
	
	


}

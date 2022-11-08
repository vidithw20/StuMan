package com.example.StuMan.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.StuMan.Domain.Module;
import com.example.StuMan.Domain.Result;
import com.example.StuMan.Domain.Student;
import com.example.StuMan.Service.ModuleService;
import com.example.StuMan.Service.ResultService;
import com.example.StuMan.Service.StudentService;



@Controller
@RequestMapping("/result")
public class ResultController {

	
	@Autowired
	  private ResultService service;
	
	
	@Autowired
	  private ModuleService services;
	
@Autowired
	
	private StudentService servicess;
	
	
	
	  
	    @GetMapping("/addresults")
	    public String add(Model model) {
	     List<Result> listresult = service.listAll();
	     List<Module> listmodule = services.listAll();
	     List<Student> liststudent = servicess.listAll();
	        model.addAttribute("listresult", listresult);
	        model.addAttribute("listmodule", listmodule);
	        model.addAttribute("liststudent", liststudent);
	        model.addAttribute("result", new Result());
	        return "addresults";
	    }
	 
	    @RequestMapping(value = "/save", method = RequestMethod.POST)
	    public String saveResult(@ModelAttribute("result") 	Result result) {
	        service.save(result);
	        return "redirect:/result";
	    }
	 
	    @RequestMapping("/edit/{rid}")
	    public ModelAndView showEditResultPage(@PathVariable(name = "rid") int rid) {
	        ModelAndView mav = new ModelAndView("addresults"); 
	        Result result = service.get(rid);
	        mav.addObject("result", result);
	        return mav;
	        
	    }
	    @RequestMapping("/delete/{rid}")
	    public String deleteResultPage(@PathVariable(name = "rid") int rid) {
	        service.delete(rid);
	        return "redirect:/student";
	    }
}

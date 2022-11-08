package com.example.StuMan.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.StuMan.Domain.AllResult;
import com.example.StuMan.Service.AllResultService;

@Controller
public class AllResultController {
	
	
	
	@Autowired
	
	private AllResultService service;
	
	
	
	 @GetMapping("/rrr")
	    public String viewResultssssPage(Model model) {
	     List<AllResult> listallresult = service.listAll();
	        model.addAttribute("listallresult", listallresult);
	        return "Student";
	    }
	
	
	
	

}

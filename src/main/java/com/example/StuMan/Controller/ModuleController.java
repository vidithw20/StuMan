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
import com.example.StuMan.Service.ModuleService;
 
@Controller
@RequestMapping("/Module")

public class ModuleController {
	
	@Autowired
	  private ModuleService service;
	
	
	
	  
	    @GetMapping("/addmodule")
	    public String add(Model model) {
	     List<Module> listmodule = service.listAll();
	        model.addAttribute("listmodule", listmodule);
	        model.addAttribute("module", new Module());
	        return "addmodule";
	    }
	 
	    @RequestMapping(value = "/save", method = RequestMethod.POST)
	    public String saveModule(@ModelAttribute("module") Module module) {
	        service.save(module);
	        return "redirect:/module";
	    }
	 
	    @RequestMapping("/edit/{id}")
	    public ModelAndView showEditModulePage(@PathVariable(name = "id") int id) {
	        ModelAndView mav = new ModelAndView("addmodule"); 
	        Module module = service.get(id);
	        mav.addObject("module", module);
	        return mav;
	        
	    }
	    @RequestMapping("/delete/{id}")
	    public String deleteModulePage(@PathVariable(name = "id") int id) {
	        service.delete(id);
	        return "redirect:/module";
	    }

}

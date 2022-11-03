
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
import com.example.StuMan.Domain.Student;
import com.example.StuMan.Service.StudentService;
 
@Controller
@RequestMapping("/Student")

public class StudentController {
	
	@Autowired
	  private StudentService services;
	
	
	
	  
	    @GetMapping("/addstudent")
	    public String add(Model model) {
	     List<Student> liststudent = services.listAll();
	        model.addAttribute("liststudent", liststudent);
	        model.addAttribute("student", new Student());
	        return "addstudent";
	    }
	 
	    @RequestMapping(value = "/save", method = RequestMethod.POST)
	    public String saveStudent(@ModelAttribute("student") Student student) {
	        services.save(student);
	        return "redirect:/student";
	    }
	 
	    @RequestMapping("/edit/{sid}")
	    public ModelAndView showEditStudentPage(@PathVariable(name = "sid") int sid) {
	        ModelAndView mav = new ModelAndView("addstudent"); 
	        Student student = services.get(sid);
	        mav.addObject("student", student);
	        return mav;
	        
	    }
	    @RequestMapping("/delete/{sid}")
	    public String deleteStudentPage(@PathVariable(name = "sid") int sid) {
	        services.delete(sid);
	        return "redirect:/student";
	    }

}
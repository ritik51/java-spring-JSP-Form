package springform.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class FormController 
{
	
	@RequestMapping("/form")
	public String showForm()
	{
		System.out.println("this is form Controller");
		return "form";
	}
	
	@RequestMapping(path="/processform", method = RequestMethod.POST)
	public String handleForm(
			@RequestParam("fullname") String fname ,
			@RequestParam("email") String useremail ,
			@RequestParam("rollno") String rolln  ,
			@RequestParam("course") String scourse ,
			@RequestParam("department") String dept ,
			Model model)
	{
		model.addAttribute("name" , fname);
		model.addAttribute("email" , useremail);
		model.addAttribute("rollno" , rolln);
		model.addAttribute("course" , scourse);
		model.addAttribute("department" , dept);
		
		return "success";
	}

}

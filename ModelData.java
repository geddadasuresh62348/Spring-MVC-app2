package com.surya.spring.mvc.RequestParam;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ModelData {
	
	// need a controller method to show the initial HTML form
	@RequestMapping("/studentForm")
	public String showForm() {
		return "studentForm";
	}
		
	@RequestMapping("/modelForm")
	public String addDataToModel(@RequestParam("studentName") String sName ,@RequestParam("studentAge") String sAge,Model model) {
		
		// convert the data to all capitals
		sName=sName.toUpperCase();
		sAge="you are "+sAge+" Years old 🎉🎉";
		// Create a message
		String result="Hey welcome !"+sName;
		
		// add message to the model
		model.addAttribute("message",result);
		model.addAttribute("age",sAge);
		
		return "modelForm";
	}
}

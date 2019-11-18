package com.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm()
	
	{
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	//public String processForm(HttpServletRequest request, Model model) {
	
	public String processFormVersionThree(@RequestParam("studentName")String theName,Model model)
	{
		
		//get the studentname from the servlet
		//String name =request.getParameter("studentName");
		//String name2 = request.getParameter("studentName");
		// perform operation i.e. all caps
		//String caps = name.toUpperCase();
	
	
	String result = "Hey my friend from v3! " +theName;
		
		//add to the model
		//model.addAttribute("data", caps);
		//model.addAttribute("name2", name2);
	model.addAttribute("message",result);
	
		
		return "helloworld";
		
		
		
	}
	
	
	 
	
	
	

}

 package com.springmvc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/customer")
public class CustomerController {
	@RequestMapping("/showForm")
	public String showForm(Model theModel)
	{
		theModel.addAttribute("customer",new customer());
		
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") customer theCustomer, BindingResult theBindingResult)
	{
		
		if(theBindingResult.hasErrors()) {
			
			return "customer-form";
		}
		else
		{
			return "customer-confirmation";
			
			
		}
	
	
	}

}

package com.spring.masterclass.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@Autowired
	userValidation validate;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage() {
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String showWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
		
		if(!validate.isUserValid(name, password)) {
			model.put("loginError", "Invalid Cedentials");
			return "login";
		}
		else {
			model.put("name", name); model.put("password", password);
			return "welcome";			
		}
	}
}

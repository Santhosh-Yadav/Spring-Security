package com.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	
	@RequestMapping(value="/home" , method=RequestMethod.GET)
	public String home()
	{
		return "home";
	}
	
	@RequestMapping(value="/admin" , method=RequestMethod.GET)
	public String adminPage()
	{
		return "adminPage";
	}
	
	@RequestMapping(value="/login" , method=RequestMethod.GET)
	public String loginPage()
	{
		return "loginPage";
	}
	
	@RequestMapping(value="/loginFailed" , method=RequestMethod.GET)
	public String loginFailedPage()
	{
		return "loginFailedPage";
	}

}

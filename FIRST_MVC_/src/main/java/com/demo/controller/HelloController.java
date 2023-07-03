package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class HelloController {
	@RequestMapping("/")
	public String displayHomePage()
	{
		System.out.println("in display login");
		return "Index";
	}
	
//	@RequestMapping("/sid")
//	public String displayHomeSidPage()
//	{
//		System.out.println("in sid login");
//		return "Sid";
//	}
//	
//	@RequestMapping("/sid1")
//	public ModelAndView sayhello()
//	{
//		String msg="suuuuuu";
//		return new ModelAndView("Hello","msg",msg);
//	}
//	
	
}

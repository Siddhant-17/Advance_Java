package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@GetMapping("/hello")
	public ModelAndView sayHello() {
		System.out.println("hello 2");
		return new ModelAndView("Hello","msg","Welcome to spring boot mvc");
		
	}
}

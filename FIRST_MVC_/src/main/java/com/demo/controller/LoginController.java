package com.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.MyUser;
import com.demo.service.LoginService;

@Controller
@RequestMapping("/myLogin")
public class LoginController {

	@Autowired
	LoginService loginservice;
	
	@PostMapping("/validate")
	public ModelAndView loginpage(HttpSession session,@RequestParam("uname") String uname,@RequestParam("pass") String pass)
	{
		MyUser m1=loginservice.validateUser(uname,pass);
		if(m1!=null) {
		session.setAttribute("user", m1);
		String msg="hello";
		return new ModelAndView("Hello","msg","success");
		}
		else 
		{
			return new ModelAndView("Index","msg","incorrect");
		}
	}
	
}

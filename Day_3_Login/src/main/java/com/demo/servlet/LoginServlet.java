package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.MyUser;
import com.demo.service.LoginService;
import com.demo.service.LoginServiceImpl;

public class LoginServlet extends HttpServlet {

	public void doPost(HttpServletRequest request ,HttpServletResponse response) throws IOException
	{
		
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		System.out.println("hello");
		LoginService ls=new LoginServiceImpl();
		String uname=request.getParameter("username");
		String pass=request.getParameter("password");
		
		MyUser mu=ls.ValidateLogin(uname,pass);
		if(mu!=null)
		{
			System.out.println("hello");
			out.println("<h1>login</h1>");
		}
	}
	
}

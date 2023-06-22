package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.service.LoginService;
import com.demo.service.LoginServiceImpl;
import com.demo.service.*;

public class RegistrationServlet extends HttpServlet{

	
	public void doPost(HttpServletRequest request ,HttpServletResponse response) throws IOException
	{
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		
		RegisterService ls=new RegisterServiceImpl();
		System.out.println("hello");
		String uname=request.getParameter("uname");
		String pass=request.getParameter("password");
		String fullname=request.getParameter("fullname");
		String phoneno=request.getParameter("phoneno");
		String email=request.getParameter("email");
		String Cpass=request.getParameter("Cpassword");
		String gender=request.getParameter("gender");
		
		ls.addUser(uname,pass,fullname,phoneno,email,Cpass,gender);
	}
}

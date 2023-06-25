package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.beans.Student;
import com.demo.service.LoginService;
import com.demo.service.LoginServiceImpl;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String uname=request.getParameter("name");
		String pass=request.getParameter("confirm-password");
		String mob=request.getParameter("mobile");
		String email1=request.getParameter("email");
		String sub=request.getParameter("subject");
		String add=request.getParameter("address");
		PrintWriter out=response.getWriter();
		LoginService ls=new LoginServiceImpl();
		Student s=ls.addStudent(uname,pass,mob,email1,sub,add);
		if(s!=null) {
		HttpSession session=request.getSession();
		session.setAttribute("student",s);
		RequestDispatcher rd=request.getRequestDispatcher("instruction");
		rd.forward(request, response);
		
		}
	}

}

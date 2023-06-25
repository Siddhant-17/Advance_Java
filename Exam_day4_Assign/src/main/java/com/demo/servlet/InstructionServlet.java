package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.beans.Student;

public class InstructionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		Student s=(Student)session.getAttribute("student");
		out.println("<form action='start' method='post'>");		
		out.println("<h1>All que are compulsory</h1>");
		out.println("<h1>no negative marking</h1>");
		out.println("<h1>each que carry 1 marks</h1>");
		out.println("<h1>you have register for"+s.getSub()+"</h1>");
		out.println("<br><button type='submit'>start test</button>   <button name='cbtn'>cancle</button>");
		out.println("</form>");
		

	}

}

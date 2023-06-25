package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.beans.Question;
import com.demo.beans.Student;
import com.demo.service.LoginService;
import com.demo.service.LoginServiceImpl;


public class ExamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		Student s=(Student)session.getAttribute("student");
		LoginService ls=new LoginServiceImpl();
		List<Question> qlist=ls.getAllQue();
		System.out.println(qlist);
		if(qlist!=null)
		{
			int i=0;
			out.println("<form>");
			for(Question q:qlist)
			{
				i++;
				out.println("<h3>Question"+i+":</h3><div class='question'>"+q.getQue()+"?</div>");
				out.println("<input type='radio' name='option' id='"+q.getOption1()+"' value='1'>'q.getOption1()'");
				out.println("<input type='radio' name='option' id='"+q.getOption2()+"' value='2'>'q.getOption2()'");
				out.println("<input type='radio' name='option' id='"+q.getOption3()+"' value='3'>'q.getOption3()'");
				out.println("<input type='radio' name='option' id='"+q.getOption4()+"' value='4'>'q.getOption1()4");
			}
			out.println("</form>");
		}
		
		
	}

}



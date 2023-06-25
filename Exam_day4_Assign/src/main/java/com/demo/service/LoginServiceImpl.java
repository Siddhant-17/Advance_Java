package com.demo.service;

import java.util.List;

import com.demo.Dao.LoginDao;
import com.demo.Dao.LoginDaoImpl;
import com.demo.beans.Question;
import com.demo.beans.Student;

public class LoginServiceImpl implements LoginService {

	private LoginDao ldao;
	
	
	public LoginServiceImpl() {
		super();
		this.ldao = new LoginDaoImpl();
	}


	@Override
	public Student addStudent(String uname, String pass, String mob, String email1, String sub, String add) {
		// TODO Auto-generated method stub
		return ldao.addStudent(uname,pass,mob,email1,sub,add);
	}


	@Override
	public List<Question> getAllQue() {
		return ldao.gettAllque();
	}



}

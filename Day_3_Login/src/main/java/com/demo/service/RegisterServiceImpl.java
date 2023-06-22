package com.demo.service;
import com.demo.dao.*;

public class RegisterServiceImpl implements RegisterService {

	
	RegisterDao rdao= new RegisterDaoImpl();
	
	@Override
	public void addUser(String uname, String pass, String fullname, String phoneno, String email, String cpass,
			String gender) {
		 rdao.addUser(uname,pass,fullname,phoneno,email,pass,gender);
	}

}

package com.demo.service;

import com.demo.beans.MyUser;
import com.demo.dao.LoginDao;
import com.demo.dao.LoginDaoImpl;
import com.demo.service.*;

public class LoginServiceImpl implements LoginService {

	private static LoginDao ldao;
	
	static {
		ldao=new LoginDaoImpl();
	}
	
	@Override
	public MyUser ValidateLogin(String uname, String pass) {
	
		return ldao.validateLogin(uname,pass);
	}

}

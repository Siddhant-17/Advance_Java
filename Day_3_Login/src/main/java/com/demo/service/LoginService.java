package com.demo.service;

import com.demo.beans.MyUser;

public interface LoginService {

	MyUser ValidateLogin(String uname, String pass);

}

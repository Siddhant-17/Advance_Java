package com.demo.dao;

public interface RegisterDao {

	int addUser(String uname, String pass, String fullname, String phoneno, String email, String cpass, String gender);

}

package com.demo.Dao;

import java.util.List;

import com.demo.beans.Question;
import com.demo.beans.Student;

public interface LoginDao {

	Student loginAuthentication(String uname, String pass);

	Student addStudent(String uname, String pass, String mob, String email1, String sub, String add);

	List<Question> gettAllque();

}

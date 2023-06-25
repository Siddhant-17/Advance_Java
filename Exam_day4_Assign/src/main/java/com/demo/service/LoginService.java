package com.demo.service;

import java.util.List;

import com.demo.beans.Question;
import com.demo.beans.Student;

public interface LoginService {

	Student addStudent(String uname, String pass, String mob, String email1, String sub, String add);

	List<Question> getAllQue();

}

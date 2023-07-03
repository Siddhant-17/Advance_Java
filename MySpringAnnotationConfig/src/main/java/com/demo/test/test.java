package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.Address;
import com.demo.beans.Student;

public class test {
	public static void main(String[] args) {
	
	ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");
	Student s1=(Student) context.getBean("student");
	System.out.println(s1);
	
	}

}

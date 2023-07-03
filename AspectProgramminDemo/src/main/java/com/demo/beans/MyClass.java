package com.demo.beans;

import org.springframework.stereotype.Component;

@Component
public class MyClass {

	public int method1()
	{
		System.out.println("inside method 1");
		return 10;
	}
	
	public void getData()
	{
		System.out.println("inside getdata");
	}
	
	public String getMyData() {
		System.out.println("inside get mydata");
		return "success";
	}
}

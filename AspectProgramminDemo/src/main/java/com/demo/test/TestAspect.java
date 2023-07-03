package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.demo.beans.*;


public class TestAspect {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("springconfig.xml");
		MyClass m1=(MyClass)context.getBean("myClass");
		m1.method1();
	}
}

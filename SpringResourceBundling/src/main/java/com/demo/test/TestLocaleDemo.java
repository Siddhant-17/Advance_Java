package com.demo.test;

package com.demo.test;
import java.util.*;


import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestLocaleDemo {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springcfg.xml");
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Marathi\n2. English uk\n3.English US\n4.Chinese\nChoice: ");
		int choice=sc.nextInt();
		MessageSource ms=(MessageSource) ctx.getBean("messageSource");
		switch (choice) {
		case 1:
			Locale =new Locale("my","marathi");
			break;

		default:
			break;
		}
	
	}
}

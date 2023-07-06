package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyHelloSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyHelloSpringBootApplication.class, args);
	//sare springcfg ke file bean controller add honge //sare annotation read honge
	//it will read all files which has annotation
		//by default all package scan
		System.out.println("hello");
	}

}

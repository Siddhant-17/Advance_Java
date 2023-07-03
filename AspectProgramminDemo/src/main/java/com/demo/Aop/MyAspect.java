package com.demo.Aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
	@Before("execution(* com.demo.*.*.method*(..))")
	public void beforAdvice()
	{
		System.out.println("in before advice");
	}
	
	
	@After("execution (* com.demo.*.*.*(..))")
	public void afterAdvice()
	{
		System.out.println("in after advice");

	}
	
	@Around("execution(* com.demo.*.*.getData(..))")
	public Object aroundAdvice(ProceedingJoinPoint joinPoint)throws Throwable{
	
		System.out.println("in around advice before call");
		Object ob=joinPoint.proceed();
		System.out.println("in around advice after call");
		return ob;
	}

	

	@AfterReturning("execution(* com.demo.*.*.method*(..))")
	private void afterReturning() {
	
		System.out.println("in after returning");

	}

}
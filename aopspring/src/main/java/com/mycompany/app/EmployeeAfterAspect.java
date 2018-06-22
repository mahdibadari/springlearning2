package com.mycompany.app;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.JoinPoint;

@Aspect
public class EmployeeAfterAspect {

	@After("args(name)")
	public void logStringArguments(String name){
		System.out.println("Running After Advice. String argument passed="+name);
	}
	
	@AfterThrowing("within(com.mycompany.app.Employee)")
	public void logExceptions(JoinPoint joinPoint){
		System.out.println("Exception thrown in Employee Method="+joinPoint.toString());
	}
	
	@AfterReturning(pointcut="execution(* getName())", returning="returnString")
	public void getNameReturningAdvice(String returnString){
		System.out.println("getNameReturningAdvice executed. Returned String="+returnString);
	}
	
}
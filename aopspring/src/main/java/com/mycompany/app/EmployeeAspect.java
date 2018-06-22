package com.mycompany.app;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAspect {

	@Before("execution(public String getName())")
	public void getNameAdvice(){
		System.out.println("Executing Advice on getName()");
	}
	
	@Before("execution(* com.mycompany.app.*.get*())")
	public void getAllAdvice(){
		System.out.println("Service method getter called");
	}
}
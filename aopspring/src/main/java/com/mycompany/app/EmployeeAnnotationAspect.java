package com.mycompany.app;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAnnotationAspect {

	@Before("@annotation(com.mycompany.app.Loggable)")
	public void myAdvice(){
		System.out.println("Executing myAdvice!!");
	}
}
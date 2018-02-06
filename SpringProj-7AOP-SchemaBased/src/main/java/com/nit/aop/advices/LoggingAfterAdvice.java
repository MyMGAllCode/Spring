package com.nit.aop.advices;

import org.aspectj.lang.JoinPoint;

public class LoggingAfterAdvice {
	
	public void afterAdvice(JoinPoint joinPoint ,Object returningValue ){
		
		System.out.println("Execution is completed on"+joinPoint.getTarget().getClass().getName()+" Class "+joinPoint.getSignature().getName()+" Method and Return Value is"+returningValue );
		
	}

}

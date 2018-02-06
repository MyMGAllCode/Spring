package com.nit.aop.advices;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

public class LoggingBeforeAdvice  {

	
	public void beforeAdvice(JoinPoint joinPoint)  {
		Logger logger=Logger.getLogger(joinPoint.getTarget().getClass().getName());
		
		logger.info("Enter into Class Name is "+joinPoint.getTarget().getClass().getName()+" Method  :"+joinPoint.getSignature().getName()+"Executed");
	
	
	
	
	
	}

}

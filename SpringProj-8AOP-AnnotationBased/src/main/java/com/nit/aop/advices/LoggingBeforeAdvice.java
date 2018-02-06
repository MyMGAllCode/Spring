package com.nit.aop.advices;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;
@Service
@Aspect
public class LoggingBeforeAdvice  {
	
	@Before("within(com.nit.aop.services.CustomerServiceImpl)")
	public void beforeAdvice(JoinPoint joinPoint)  {
		Logger logger=Logger.getLogger(joinPoint.getTarget().getClass().getName());
		
		logger.info("Enter into Class Name is "+joinPoint.getTarget().getClass().getName()+" Method  :"+joinPoint.getSignature().getName()+"Executed");
	
	
	
	
	
	}

}

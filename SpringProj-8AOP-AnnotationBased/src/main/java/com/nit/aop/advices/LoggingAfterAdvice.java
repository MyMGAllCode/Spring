package com.nit.aop.advices;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;
@Service
@Aspect
public class LoggingAfterAdvice {
private static	Logger logger=Logger.getLogger(LoggingAfterAdvice.class);
	@AfterReturning(pointcut="execution(* print*(..))",returning ="returnValue")
	public void afterAdvice(JoinPoint joinPoint ,Object returnValue ){
		
		logger.info("Execution is completed on"+joinPoint.getTarget().getClass().getName()+" Class "+joinPoint.getSignature().getName()+" Method and Return Value is"+returnValue );
		
	}

}

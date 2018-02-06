package com.nit.aop.advices;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.springframework.aop.AfterReturningAdvice;

public class LoggingAfterAdvice  implements AfterReturningAdvice{
private static Logger logger=Logger.getLogger(LoggingAfterAdvice.class);
	@Override
	public void afterReturning(Object returnvalue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("After Executing :"+target.getClass().getName()+"Method Nmae :"+method.getName()+"Returning Value"+returnvalue);
		
		
	}

}

package com.nit.aop.advices;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.springframework.aop.MethodBeforeAdvice;




public class LoggingBeforeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
	 Logger logger=Logger.getLogger(target.getClass().getName());
	 logger.info("Entered into "+target.getClass().getName()+" Class "+method.getName()+" Method with the argument"+args.length);
	 
	 
	}

}

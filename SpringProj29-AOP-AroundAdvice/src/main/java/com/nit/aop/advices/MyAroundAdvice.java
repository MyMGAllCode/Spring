package com.nit.aop.advices;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.Logger;

import com.nit.aop.security.AuthorizedManager;
public class MyAroundAdvice implements  MethodInterceptor {
	
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object target=invocation.getThis();
		System.out.println(target.getClass().getName());
		Method method=invocation.getMethod();
		Logger  logger=Logger.getLogger(target.getClass().getName());
		logger.info("Entered into "+target.getClass().getName()+""+method.getName()+"Method");
		Integer count=0;
		try{
			AuthorizedManager am=new AuthorizedManager();
			boolean flag=am.isAuthorized("admin");
			if(flag==false){
				throw new IllegalAccessException("User is Not Authorized");
			}//if
		count=	(Integer)invocation.proceed();
		if(count>0){
			logger.info(method.getName()+"Operation Successfully Done");
			
		}
		else
		{
			logger.info(method.getName()+"Operation Failure");
		}
			
			
		}//Try
		
		catch(Exception exception)
		{logger.info("While Executing "+method.getName()+"Exception Occured"+exception.getMessage());
		logger.info(method.getName()+"Opertation Failure");
			
		}//Catch
logger.info(method.getName()+"Method Execution is completed ");

		return count;
	
	
	}//Method

}//Class

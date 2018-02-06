package com.nit.aop.advices;

import org.springframework.aop.ThrowsAdvice;

public class LogginThrowableAdvice implements ThrowsAdvice {
	public void afterThrowing(Method m,Object args[],Object target,Exception e)
	   {
	       // our services
	   }

}

package com.test;

import java.lang.reflect.Constructor;

public class Test {
	public static void main(String[] args) throws Exception{
		// Loading the bean class by forName() Method
		//Class cls=Class.forName("java.lang.Thread");
		Class cls=Class.forName("java.util.Scanner");

		
		
		// Checking bean is configured  to create with new operator and constructor (or) with factory 
		//methods . If bean is configured  to create with new operator  and  cons
		Constructor []cons=cls.getDeclaredConstructors();
		Constructor con=cons[0];
		
		//Displaying info about Bean
		System.out.println("Information About Thread Class:::"+con);
		
	Object obj=null;
	//Checking Constructor is accessible  or not 
	if(con.isAccessible())
		obj=con.newInstance();
	else
	{
		// if not Accessible 
		// It Make Accessible
		con.setAccessible(true);
		// There may be check getting Security Exception 
		obj=con.newInstance();
		
	}
		System.out.println("Information About Given Bean "+obj.getClass());
	}

}

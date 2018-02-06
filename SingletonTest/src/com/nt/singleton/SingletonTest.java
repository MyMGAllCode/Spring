package com.nt.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		// PrintWriter pw=new PrintWriter();//Constructor is private then
		// compiletime error is SHOWING
		PrintWriter pw = PrintWriter.getInstance();
		PrintWriter pw1 = PrintWriter.getInstance();
		System.out.println("PW obj Hascode::" + pw.hashCode() );
		System.out.println("PW1 obj Hascode::" + pw1.hashCode());
		
		
		

		//////////////////
		//Checking  Thread Safe Singleton
		
		////////////////
		
		Thread th1=null,th2=null;
		th1=new Thread(PrintWriter.getInstance());
		th2=new Thread(PrintWriter.getInstance());
		th1.start();
		th2.start();
		
		
		//Here We want to make public visibility of the constructor using Reflection API
		
		Class clzz=Class.forName("com.nt.singleton.PrintWriter");
		Constructor conn[]=clzz.getDeclaredConstructors();
		Constructor con= conn[0];
		Object obj=null,obj1=null,obj2=null;
		if(con.isAccessible())
		obj=con.newInstance();
		else 
		{
		con.setAccessible(true);
		obj=con.newInstance();
		obj1=con.newInstance();
		obj2=con.newInstance();
		
		}
		System.out.println("Again Consructor is called obj  Has Code is :"+obj.hashCode());
		System.out.println("Again Consructor is called obj2  Has Code is :"+obj1.hashCode());
		System.out.println("Again Consructor is called obj2  Has Code is :"+obj2.hashCode());
		
		//System.out.println(clzz[0]);
		
		
	}

}

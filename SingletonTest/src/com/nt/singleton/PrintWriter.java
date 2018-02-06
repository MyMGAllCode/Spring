package com.nt.singleton;

import javax.management.InstanceAlreadyExistsException;

public class PrintWriter implements Runnable {
	private static boolean isNew = true;
	private static  PrintWriter pw=null;
	
	static{
		
			pw=new PrintWriter();
			
		
		
	}
	private PrintWriter(){
		if(isNew){
			System.out.println("0-Param Constructor is called");
			isNew=false;
		}
		else{
			System.out.println("Instance is Already Existed cant be create Multiple obj ");
			System.exit(0);
		}
		
		
	}
	public static PrintWriter getInstance(){
		
	
		return pw;
	}
	@Override
	public void run() {
	PrintWriter pw=PrintWriter.getInstance();
	System.out.println("Thread created Instance"+pw.hashCode());
		
	}
	

}

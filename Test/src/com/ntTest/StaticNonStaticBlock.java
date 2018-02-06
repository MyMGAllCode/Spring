package com.ntTest;

public class StaticNonStaticBlock {
	
	{
		System.out.println("1 Non Static block");
	}
	{
		System.out.println("2 Non Static block");
		
		
	}
	
	
	static{
		System.out.println("1  Static block");
		
	}
	
	static{
		System.out.println("2  Static block");
		
	}
}

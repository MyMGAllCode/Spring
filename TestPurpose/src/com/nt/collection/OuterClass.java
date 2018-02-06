package com.nt.collection;

public class OuterClass {
	Integer x=4;
	Integer y=0;
	String name="DKK";
	
	class InnerClass{
		OuterClass oc=new OuterClass();
		int y=x;
		
	}
	
	

}

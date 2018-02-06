package com.test;
//Designing Singleton Class 
public class Test {
	
	// But this approach is not good to create singleton class bcoz if any exception raise here at the time of creation of obj
	//private static Test t=new Test();
	
	
	// So Second approach is for creating singleton class is  static block and we can handle the  exception inside static block
	private static Test t=null;
	static
	{
		t=new Test();//we can throw or handle here exception
		
	}
	
	private Test(){
		System.out.println("Constructor Called");
		
	}
	
	//This Approach is not for Singleton Class bcoz it  testFactory() methods create the obj of test but Jitne bar Call Karenge utni bar naya obj Create hogs 
	
	//So this is not singleton Class Approach
	//public static Test testFactory(){
	//	return new Test();
	//}

	
	//This for Singleton Class Approach
	
	public static Test testFactroySingleton()
	{
		return t;
	}
}


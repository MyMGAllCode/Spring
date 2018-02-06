package com.test;

public class DriverClass {
	public static void main(String[] args) {
		
		// These for creating obj by factory method 
		//Test t2= Test.testFactory();
		//Test t3= Test.testFactory();
		//Test t4= Test.testFactory();
		
		//This approach is for creating obj when class is loaded in static block 
		//Here We created three object of test class but obj of test class is create only one time in static block when class loaded 
		// So in these three created object return only single objects 
		
Test t1=Test.testFactroySingleton();
Test t2=Test.testFactroySingleton();

Test t3=Test.testFactroySingleton();


		
		System.out.println("Created Object hasCode:: "+"\n1st Constructor::"+t1.hashCode()+"\n2nd Constructor::"+t2.hashCode()+"\n3rd Constructor::"+t3.hashCode());
	}

}

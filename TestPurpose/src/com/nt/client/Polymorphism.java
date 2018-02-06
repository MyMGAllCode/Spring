package com.nt.client;

import java.io.FileNotFoundException;
import java.io.IOException;


public class Polymorphism extends PolymorphismMethod{
	@Override
	public void ad() throws FileNotFoundException{
		System.out.println("Override method called");
		}

	public static void main(String[] args) throws IOException {
		
		Polymorphism p=new Polymorphism();
		PolymorphismMethod pm=new Polymorphism();
		p.ad();
		
		pm.ad();
	}

}

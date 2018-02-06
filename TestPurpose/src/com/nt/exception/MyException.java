package com.nt.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyException {
	
	public static void main(String[] args) {
		FileReader file=null;
		try {
			file = new FileReader("C:\\test\\a.txt");
		} 
		/*catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File Not Found Exception");
		}*/
		catch(Exception e){
			System.out.println("File Not Found Exception");
		}
	        BufferedReader fileInput = new BufferedReader(file);
	         
	        // Print first 3 lines of file "C:\test\a.txt"
	        for (int counter = 0; counter < 3; counter++)
				try {
					System.out.println(fileInput.readLine());
				}
	       
	        catch (IOException e) {
					System.out.println("IOException is Occured");
				}
	         
	        try {
				fileInput.close();
			} catch (IOException e) {
				System.out.println("IO Exception for close");
			}
	        
		
		 
	}

}

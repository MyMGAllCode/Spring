package com.nit.bean;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

public class Cashier {
	private double totalPrice;
	private String fileName;
	private String filePath;
	private PrintWriter printWriter;
	public Cashier(String filePath,String fileName)
	{
		this.fileName=fileName;
		this.filePath=filePath;
		openStream();
	}
	public void openStream()
	{
		try{
		printWriter=new PrintWriter(filePath+fileName+".txt");
	}catch(FileNotFoundException fe){
		System.out.println("Excetion Occured when creating printWriter Obj::"+fe.getMessage());
	}
	}
		
	
	
	
	public void calculateTotalPrice(ShoppingCart cart)
	{
		List<Product> products=cart.getProducts();
		
		for(Product product:products){
			writeProductToFile(product);
			totalPrice=totalPrice+product.getProductPrice();
		}
		printWriter.println("....................");
		printWriter.println("Total Price="+totalPrice);
		System.out.println("....................");
		System.out.println("Total Price="+totalPrice);
		printWriter.flush();
	}
	public void writeProductToFile(Product product){
	printWriter.println("ProductName"+product.getProductName()+"\tPrice:"+product.getProductPrice()+"\tDate"+new Date() );
	
	System.out.println("ProductName"+product.getProductName()+"\tPrice:"+product.getProductPrice()+"\tDate"+new Date() );
	}
	
	}


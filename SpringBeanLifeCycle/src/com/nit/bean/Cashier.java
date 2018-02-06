package com.nit.bean;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;



public class Cashier// implements InitializingBean, DisposableBean
{
	private float totalPrice;
	private String fileName;
	private String filePath;
	
	PrintWriter printWriter;
	@PostConstruct //	To be use later
	public void openStream() {
		try {
			printWriter=new PrintWriter(filePath+fileName+".txt");

			System.out.println("Open Stream Called");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@PreDestroy  //To be use later
	public void closeStream() {
		printWriter.close();
		System.out.println("Close Stream ");
		
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public void  calculateTotal(ShoppingCart cart) {
		List<Product> prod =cart.getCart();

		printWriter.println("Date is:"+new Date());
		for (Product p:prod) {
			writeToFile(p);
			totalPrice+=p.getPrice();
			
		}
		printWriter.println("================");
		printWriter.println("total :"+totalPrice);
		System.out.println("total:"+totalPrice);
		printWriter.flush();
	}
	public void writeToFile(Product product) {
		printWriter.println("Prod NO:"+product.getPno()+" Prod Name: "+product.getPname()+"Prod Price:"+product.getPrice());
		
		
	}
//	@Override
//	public void destroy() throws Exception {
//		printWriter.close();
//		System.out.println("Close Stream Called");
//		
//	}
//	@Override
//	public void afterPropertiesSet() throws Exception {
//		openStream();
//		System.out.println("Open Stream Called");
//		
//	}

}

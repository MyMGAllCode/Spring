package com.nit.client;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nit.bean.Cashier;
import com.nit.bean.ShoppingCart;

public class Test {
	public static void main(String[] args) {
		ClassPathResource resource=new ClassPathResource("com/nit/cfg/myBeans.xml");
		XmlBeanFactory factory=new XmlBeanFactory(resource);
		ShoppingCart shoppingCart=(ShoppingCart)factory.getBean("shoppingCart");
		
		Cashier cashier=(Cashier)factory.getBean("cashier");
		
		cashier.calculateTotalPrice(shoppingCart);
		
	}

}

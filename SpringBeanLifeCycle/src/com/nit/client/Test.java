package com.nit.client;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.bean.Cashier;
import com.nit.bean.ShoppingCart;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/nit/cfg/myBean.xml");
		ShoppingCart shoppingCart=context.getBean("shoppingCart",ShoppingCart.class);
		Cashier cashier=context.getBean("cashier",Cashier.class);
		cashier.calculateTotal(shoppingCart);
	context.close();
	
		
	
	}

}

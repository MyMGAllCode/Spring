package com.nit.client;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.nit.bean.Cashier;
import com.nit.bean.MyBeanPostProcessor;
import com.nit.bean.ShoppingCart;

public class Test {
	public static void main(String[] args) {
		XmlBeanFactory context = new XmlBeanFactory(new ClassPathResource("com/nit/cfg/myBean.xml"));
		BeanPostProcessor beanPostProcessor=context.getBean("myBeanPostProcessor",MyBeanPostProcessor.class);
		context.addBeanPostProcessor(beanPostProcessor);
		ShoppingCart shoppingCart = context.getBean("shoppingCart", ShoppingCart.class);
		Cashier cashier = context.getBean("cashier", Cashier.class);
		cashier.calculateTotal(shoppingCart);
		
		

	}

}

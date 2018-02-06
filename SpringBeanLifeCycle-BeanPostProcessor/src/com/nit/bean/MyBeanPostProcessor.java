package com.nit.bean;

import java.io.File;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object beanObject, String beanName) throws BeansException {
		
		System.out.println("inside postProcessAfterInitialization()-"+beanName);
		return beanObject;
	}

	@Override
	public Object postProcessBeforeInitialization(Object beanObject, String beanName) throws BeansException {
		
		System.out.println("inside postProcessBeforeInitializatione()-"+beanName);
		if(beanObject instanceof Cashier)
		{
			Cashier cashier=(Cashier)beanObject;
			String dir=cashier.getFilePath();
			File file=new File(dir);
			if(file.mkdirs())
			{
				System.out.println("Directory created :"+dir);
			}else {

				System.out.println("Directory allready exist :"+dir);
			}
			
		}
		return beanObject;
	}

}

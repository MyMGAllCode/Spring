package com.nt.test;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.dao.UserDAO;
import com.nt.domain.User;

public class TestUser {
	private static Logger logger=Logger.getLogger(TestUser.class);
	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("com/nt/cfg/myBeans.xml");
		
		
		UserDAO	 dao=context.getBean("userDAO",UserDAO.class);
		User user=new User();
		user.setUserId(10022);
		user.setUserName("Dk");
		user.setUserEmail("dk@gmail.com");
		logger.info("User Object value setted");
	int count=	dao.registerUser(user);
	logger.info("User Object value not setted");
	if(count==1)
		System.out.println("User Registered");
	else 
		System.out.println("User Not Registered");
		
	}

}

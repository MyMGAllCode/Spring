package com.test;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import javax.jms.JMSException;
import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.test.service.MessageReceiver;
import com.test.service.MessageSender;

public class Test {

	public static void main(String[] args) throws JMSException {
		ApplicationContext  context=new AnnotationConfigApplicationContext(MyConfiguration.class);
		DataSource dataSource=(DataSource) context.getBean("dataSource");
		 // System.out.println("dataSource:"+dataSource);
		 Connection connection = null;
		try {
			connection = dataSource.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 try {
			DatabaseMetaData data=connection.getMetaData();
			System.out.println("Data base version"+data.getDatabaseProductVersion());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	MessageSender messageSender=	 context.getBean(MessageSender.class);
	messageSender.sendMessage("Welcome!!!");
	MessageReceiver messageReceiver=context.getBean(MessageReceiver.class);
	messageReceiver.receiveMessage();
		 
	}

}

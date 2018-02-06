package com.test.service;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

	@Autowired
	private JmsTemplate jmsTemplate;
	@Autowired
	private Destination destination;

	public JmsTemplate getJmsTemplate() {
		return jmsTemplate;
	}

	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

	public Destination getDestination() {
		return destination;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}

	/*
	 * public void sendMessage(final String msg) {
	 * 
	 * jmsTemplate.send(destination,new MessageCreator(){
	 * 
	 * @Override public Message createMessage(Session session) throws
	 * JMSException{ Message objectMessage = (Message) session.createQueue(msg);
	 * return objectMessage; } }); }
	 */
	public void sendMessage(final String msg) {
		 
		         System.out.println("Producer sends " + msg);
		jmsTemplate.send(destination, new MessageCreator() {
			
			                public Message createMessage(Session session)
			
			                        throws JMSException {
			
			                    return (Message) session.createTextMessage(msg);
			
			                	
			                }});
			
	

	}
}

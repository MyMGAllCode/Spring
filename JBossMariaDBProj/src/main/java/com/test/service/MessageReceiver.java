package com.test.service;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;

public class MessageReceiver {
	static final Logger LOG = LoggerFactory.getLogger(MessageReceiver.class);
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
    
    /*@Autowired
    MessageConverter messageConverter;
     
    @Autowired
    OrderService orderService;
 
     */
 /*  @Override
    public void onMessage(Message message) {
        try {
            LOG.info("-----------------------------------------------------");
            Product product = (Product) messageConverter.fromMessage(message);
            LOG.info("Application : order received : {}",product);  
            orderService.processOrder(product);
            LOG.info("-----------------------------------------------------");
        } catch (JMSException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
         
    }
}*/
	
	public String receiveMessage() throws JMSException
	{
		TextMessage message=(TextMessage) jmsTemplate.receive(destination);
		return  message.getText();
	}


}

package com.test;
import java.util.Arrays;

import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.sql.DataSource;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.spring.ActiveMQConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jms.connection.CachingConnectionFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.listener.DefaultMessageListenerContainer;
import org.springframework.jms.listener.MessageListenerContainer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.test.service.MessageReceiver;
import com.test.service.MessageSender;
@Configurable
@Configuration
@EnableTransactionManagement
@PropertySource(value={"com/test/database.properties"})
@ComponentScan({"com.test"})
@ComponentScan(basePackages = "com.test")
 class MyConfiguration {
	 private static final String DEFAULT_BROKER_URL = "tcp://localhost:61616";
     
	    private static final String ORDER_QUEUE = "order-queue";
	    private static final String ORDER_RESPONSE_QUEUE = "order-response-queue";
	     
	    @Autowired
	    MessageReceiver messageReceiver;
	@Bean("dataSource")
	public DataSource getDataSource(){
		
		DriverManagerDataSource datasource=new DriverManagerDataSource();
		
		datasource.setDriverClassName("org.mariadb.jdbc.Driver");
		datasource.setUrl("jdbc:mariadb://localhost:3307/mgdb?autoReconnect=true&useSSL=false");
		datasource.setUsername("root");
		datasource.setPassword("admin");
		return datasource;
	}
	
	@Bean
    public ConnectionFactory connectionFactory(){
        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
        connectionFactory.setBrokerURL(DEFAULT_BROKER_URL);
        connectionFactory.setTrustedPackages(Arrays.asList("com.test"));
        return connectionFactory;
    }
    /*
     * Optionally you can use cached connection factory if performance is a big concern.
     */
 
    @Bean
    public ConnectionFactory cachingConnectionFactory(){
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory();
        connectionFactory.setTargetConnectionFactory(connectionFactory());
        connectionFactory.setSessionCacheSize(10);
        return connectionFactory;
    }
     
    /*
     * Message listener container, used for invoking messageReceiver.onMessage on message reception.
     */
    @Bean
    public MessageListenerContainer getContainer(){
        DefaultMessageListenerContainer container = new DefaultMessageListenerContainer();
        container.setConnectionFactory(connectionFactory());
        container.setDestinationName(ORDER_RESPONSE_QUEUE);
        container.setMessageListener(messageReceiver);
        return container;
    }
    
    @Bean
    public Destination destination(){
    	Destination destination=new ActiveMQQueue("messageQueue1");
		return destination;
    }
 
    /*
     * Used for Sending Messages.
     */
    @Bean
    public JmsTemplate jmsTemplate(){
        JmsTemplate template = new JmsTemplate();
        template.setConnectionFactory(connectionFactory());
        template.setDefaultDestinationName(ORDER_QUEUE);
        return template;
    }
     
    @Bean
    public MessageReceiver receiveMessage()
    {MessageReceiver messageReceiver=new MessageReceiver();
    messageReceiver.setJmsTemplate(jmsTemplate());
    messageReceiver.setDestination(destination());
    return messageReceiver;
    	
    }
     
  @Bean
  public MessageSender sendMessage()
  {MessageSender messageSender=new MessageSender();
  messageSender.setJmsTemplate(jmsTemplate());
  messageSender.setDestination(destination());
  return messageSender;
  }
     
}



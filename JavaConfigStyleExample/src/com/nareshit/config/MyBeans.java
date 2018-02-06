package com.nareshit.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
@Configuration
@ComponentScan(basePackages={"com.nareshit.service","com.nareshit.dao"})

public class MyBeans {
	@Value("${database.driverClassName}")
	private String driverClassName;
	@Value("${database.url}")
	private String url;
	@Value("${database.username}")
	private String username;
	@Value("${database.password}")
	private String password;
	@Bean(name="dataSource")
	public DataSource dataSource()
	{
		DriverManagerDataSource dataSource =new DriverManagerDataSource();
		dataSource.setDriverClassName(driverClassName);
		dataSource.setUrl(url);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		return dataSource;
	}

	@Bean
	public static  PropertyPlaceholderConfigurer placeholderconfigure(){
		PropertyPlaceholderConfigurer placeholderConfigurer =new PropertyPlaceholderConfigurer();
		Resource resource=new ClassPathResource("com/nareshit/config/database.properties");
		placeholderConfigurer.setLocation(resource);
		return placeholderConfigurer;
	}
	

}

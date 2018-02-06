package com.nt.cfg;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages={"com.nt.dao"})
public class MyBean {
	@Value("${database.dbclass}")
	
	private String driverClassName;
	
	@Value("${database.url}")
	private String url;
	@Value("${database.username}")
	private String username;
	@Value("${database.password}")
	private String password;
	
	
@Bean
public static PropertyPlaceholderConfigurer propertyPlaceholderConfigurer()
{
	
	PropertyPlaceholderConfigurer placeholderConfigurer=new PropertyPlaceholderConfigurer();
	
	Resource resource=new ClassPathResource("com/nit/SpringJDBCTemplateConfigStyle/database.properties");
	placeholderConfigurer.setLocation(resource);
	return  placeholderConfigurer;
}
	@Bean
	public DataSource dataSource()
	{
		DriverManagerDataSource  datasource=new DriverManagerDataSource();
		datasource.setDriverClassName(driverClassName);
		datasource.setUrl(url);
		datasource.setUsername(username);
		datasource.setPassword(password);
		return datasource;
		
		
	}
	@Bean(autowire=Autowire.BY_TYPE)
	public JdbcTemplate jdbcTemplate()
	{
		
		 return new JdbcTemplate();

	}
	
		


}

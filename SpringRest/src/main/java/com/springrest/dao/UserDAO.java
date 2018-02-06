package com.springrest.dao;



import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springrest.domain.User;

public interface UserDAO {
	public boolean registerUser(User user);
	
	
	

}

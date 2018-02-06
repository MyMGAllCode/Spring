package com.springrest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.dao.UserDAO;
import com.springrest.domain.User;

@Service
public class UserService {
	@Autowired
	private UserDAO userDAO;
	public boolean registerUser(User user){
		return userDAO.registerUser(user);
	}

}

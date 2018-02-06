/**
 * 
 */
package com.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.dao.UserDAO;
import com.user.domain.User;

/**
 * @author DKP
 *
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO userDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.user.service.UserService#userRegister(com.user.domain.User)
	 */
	@Override
	public int userRegister(User user) {
		int count=userDAO.registerUser(user);
		return count;
	}

}

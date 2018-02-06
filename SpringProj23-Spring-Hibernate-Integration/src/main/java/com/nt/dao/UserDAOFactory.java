package com.nt.dao;

public class UserDAOFactory {
	public UserDAO getInstance()
	{
		return new UserDAOImpl();
	}

}

package com.nt.dao;

import java.util.List;

import com.nt.domain.User;

public interface UserDAO {
	public int registerUser(User user);
	public List<User> getAllUser(int userId);

}

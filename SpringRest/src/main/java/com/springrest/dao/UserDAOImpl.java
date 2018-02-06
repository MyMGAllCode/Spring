package com.springrest.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springrest.domain.User;
@Repository
public class UserDAOImpl implements UserDAO{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public boolean registerUser(User user) {
		
		String sql="insert into UserDetails vlaues(?,?,?)";
	int count=	jdbcTemplate.update(sql,user.getUserId(),user.getName(),user.getMobile(),user.getAddrs());
	if(count>0){
		return true;
	}
	else
		return false;
	
	}

}

package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.bo.LoginUserBO;
@Repository
public class LoginDAO {
	@Autowired
	private HibernateTemplate template;
	public int insertLogin(LoginUserBO bo) {
		int result = (Integer) template.save(bo);
		return result;

	}

}

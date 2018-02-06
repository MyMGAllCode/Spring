package com.nt.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.transaction.annotation.Transactional;

import com.nt.domain.User;

public class UserDAOImpl implements UserDAO {
	private static Logger logger=Logger.getLogger(UserDAOImpl.class);

	private HibernateTemplate hibernateTemplate;
	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	

	@Transactional(readOnly=false)
	public int registerUser(User user) {
		logger.info("before Save Method Callaed");
		
	
	int count=	(int) hibernateTemplate.save(user);
	
		logger.info("Save Method Callaed");
		
		return count ;
	}

	@Override
	public List<User> getAllUser(int userId) {
		
		String hql="from User";
		
		List<User>list=(List<User>) hibernateTemplate.find(hql);
		
		return list;
	}

}

package com.user.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.user.domain.User;
@Repository
public class UserDAOImpl implements UserDAO {
	@Autowired
	private SessionFactory sessionFactory;
	Session session=null;
	Transaction tx=null;
	int count=0;
	

	@Override
	public int registerUser(User user) {
		session=sessionFactory.openSession();
		
		tx=session.beginTransaction();
		if(user!=null){
			try{
			count=(int)session.save(user);
			tx.commit();
			}//try
			catch(Exception e){
				tx.rollback();
			}
			
		}
		
		return count;
	}

}

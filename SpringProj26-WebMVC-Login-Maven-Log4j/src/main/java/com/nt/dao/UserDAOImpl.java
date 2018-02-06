/**
 * 
 */
package com.nt.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.nt.domain.Login;

/**
 * @author DKP
 *
 */
public class UserDAOImpl implements UserDAO {
	private SessionFactory sessionFactory;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nt.dao.UserDAO#login(com.nt.domain.Login)
	 */
	@Override
	public Login login(Login login) {

		if (login!=null) {
			Session session = sessionFactory.openSession();
			if (session != null) {
				Query query = session.createQuery(
						"select login.userName, login.userRole from Login as login where login.userId=? and login.password=?");
				query.setParameter(0, login.getUserId());
				query.setParameter(1, login.getPassword());
				Object[] user = (Object[]) query.uniqueResult();
				if (user != null) {
					login.setPassword(null);
					if (user.length > 0) {
						login.setUserName( (String)user[0]);
						login.setUserRole((String) user[1]);
					} // if
				} // if
			} // if
		} // if
		
		return login;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}

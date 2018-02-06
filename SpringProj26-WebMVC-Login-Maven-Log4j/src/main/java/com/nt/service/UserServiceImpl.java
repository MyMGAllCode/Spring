/**
 * 
 */
package com.nt.service;

import com.nt.dao.UserDAO;
import com.nt.domain.Login;

/**
 * @author DKP
 *
 */
public class UserServiceImpl implements UserService {
private UserDAO userDao;
	public void setUserDao(UserDAO userDao) {
	this.userDao = userDao;
}
	/* (non-Javadoc)
	 * @see com.nt.service.UserService#login(com.nt.domain.Login)
	 */
	@Override
	public Login login(Login login) {
		
		
		login =userDao.login(login);
		
		
		
		return login;
	}

}

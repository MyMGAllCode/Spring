package com.nit.aop.security;

public class AuthorizedManager {
	public boolean isAuthorized(String userRole){
		boolean flag=false;
		if(userRole!=null&&userRole.equals("admin"))
			
		{
			return true;
		}
		return flag;
	}

}

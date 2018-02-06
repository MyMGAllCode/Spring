package com.nit.aop.services;

import com.nit.aop.dao.AccountDAO;
import com.nit.aop.exceptions.InsufficientBalanceException;
import com.nit.aop.exceptions.InvalidAmmountException;

public class AccountServiceImpl implements AccountService {
private AccountDAO accountDAO;
	public AccountDAO getAccountDAO() {
	return accountDAO;
}

public void setAccountDAO(AccountDAO accountDAO) {
	this.accountDAO = accountDAO;
}

	@Override
	public Double withdraw(Integer account, Double amt) {
		Double totalbalance=accountDAO.getBalance(account);
		//Business Logic
		if(totalbalance>=amt){
			
			totalbalance=totalbalance-amt;
		accountDAO.setBalance(account, totalbalance);
		return totalbalance;
		}
		
		else{
			throw new InsufficientBalanceException("Insufficient Ammoutn in your account"+account);
		}
	}

	@Override
	public Double deposit(Integer account, Double amt) {
		Double totalbalance=accountDAO.getBalance(account);
		//Business Logic
		if(amt>0){
			totalbalance=totalbalance+amt;
			accountDAO.setBalance(account,totalbalance);
			return totalbalance;
		}
		else{
			throw new InvalidAmmountException(" Entred ammount "+amt+"Invalid");
		}
		}
		

}

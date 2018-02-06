package com.nit.aop.dao;

public interface AccountDAO {
	public Integer setBalance(Integer acnt,Double amt);
	public Double getBalance(Integer acnt);
}

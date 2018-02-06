package com.nit.aop.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class AccountDAOImpl implements AccountDAO {
private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
	return jdbcTemplate;
}

public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}

	@Override
	public Integer setBalance(Integer acnt, Double amt) {
		String sql="update account set balance=? where accountId=?";
		
		
		return jdbcTemplate.update(sql,amt,acnt);
	}

	@Override
	public Double getBalance(Integer acnt) {
		String sql="select balance from account where  accountId=?";
		return jdbcTemplate.queryForObject(sql, Double.class, acnt);
	}

}

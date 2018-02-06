package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bo.LoginUserBO;
import com.dao.LoginDAO;
import com.dto.LoginUserDTO;

@Service
public class LoginService {
	@Autowired
	private LoginDAO dao;

	public String display(LoginUserDTO dto) {
		LoginUserBO bo = new LoginUserBO();
		bo.setUserName(dto.getUserName());
		bo.setPassword(dto.getPassword());
		bo.setDob(dto.getDob());
		int count = dao.insertLogin(bo);
		if (count > 0)
			return "record inserted";
		else
			return "record not inserted";

	}

}

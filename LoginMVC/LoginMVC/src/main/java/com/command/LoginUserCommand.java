package com.command;

import java.util.Date;

public class LoginUserCommand {

		private String userName;
		private String password;
		private Date dob;

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public Date getDob() {
			return dob;
		}

		public void setDob(Date dob) {
			this.dob = dob;
		}

	}


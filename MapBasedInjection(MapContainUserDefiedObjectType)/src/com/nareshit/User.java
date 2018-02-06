package com.nareshit;

public class User {
	private int id;
	private String name;
	private String email;
	public String toString(){
		return "user id:"+id+"User Name:"+name+"Email:"+email;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}

package com.nareshit.bean;

public class Student {
	private Address address;
	private int sno;
	private String sname;
	public String toString()
	{
		return sno+":"+sname+":"+address;
		
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}

}

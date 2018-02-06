package com.nit.aop.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	@Value("Dharmendra")
private String name;
@Value("http://www.seekzed.com")
private String url;
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getUrl() {
	return url;
}

public void setUrl(String url) {
	this.url = url;
}

	@Override
	public String printName() {
		System.out.println("Print Name "+name);
		return name;
	}

	@Override
	public String printURL() {
		System.out.println("Print URL "+url);
		return url;
	}

	@Override
	public void printException() {
		System.out.println("Throw Exception ");
		throw new RuntimeException(" This is Runtime exception Please Don't Ignore its");

	}

}

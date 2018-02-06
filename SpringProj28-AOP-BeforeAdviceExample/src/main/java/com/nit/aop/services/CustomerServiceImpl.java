/**
 * 
 */
package com.nit.aop.services;

/**
 * @author DKP
 *
 */
public class CustomerServiceImpl implements CustomerService {

	private String name,url;
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

	/* (non-Javadoc)
	 * @see com.nit.aop.services.CustomerService#printName()
	 */
	@Override
	public String printName() {
		System.out.println("Business Method :printName()");
		return name;
	}

	/* (non-Javadoc)
	 * @see com.nit.aop.services.CustomerService#printURL()
	 */
	@Override
	public String printURL() {
		System.out.println("Business Method :printUrl()");
		return url;
	}

	/* (non-Javadoc)
	 * @see com.nit.aop.services.CustomerService#printException()
	 */
	@Override
	public void printException() throws InterruptedException {
		System.out.println("Business Method :printException()");
		throw new InterruptedException("Business Exception");
	}

}

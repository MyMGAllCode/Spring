package com.rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class SayHello {
	@GET
	@Path("/msg")
	@Produces(MediaType.TEXT_PLAIN)
	public String sayMsg(@QueryParam("name") String name){
		return "Hello"+name;
	}

}

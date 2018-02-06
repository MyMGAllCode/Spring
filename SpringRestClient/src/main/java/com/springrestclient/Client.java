package com.springrestclient;

import org.springframework.web.client.RestTemplate;

import com.springrest.domain.User;

public class Client {
	public static void main(String[] args) {
		/*String url="http://localhost:5555/SpringRest/sayhello/{name}";
	RestTemplate restTemplate=new RestTemplate();
	
	Map<String, String>map=new HashMap<String,String>();
	map.put("name","Dharmendra");
	System.out.println(restTemplate.getForObject(url, String.class,map));*/
		//User Registraion 
		String url="http://localhost:5555/SpringRest/registerUser";
		User user=new User();
		user.setUserId(1001);
		user.setName("Dharemndra");
		user.setMobile("888888888");
		user.setAddrs("Hyderaad");
		
		RestTemplate restTemplate=new RestTemplate();
		System.out.println(restTemplate.getForObject(url, String.class, user));
		
	}

}

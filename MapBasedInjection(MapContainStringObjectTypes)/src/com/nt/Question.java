package com.nt;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	private int id;
	private String name;
	private Map<String, String>answer;
	public Question(int id,String name,Map<String,String>answer){
		this.id=id;
		this.name=name;
		this.answer=answer;
		}
	public void displayInfo()
	{
		System.out.println("Question Id"+id);
		System.out.println("Question Name"+name);
		System.out.println("Answer...........");
		Set<Entry<String ,String>>set=answer.entrySet();
		Iterator<Entry<String, String>>itr=set.iterator();
		while(itr.hasNext()){
			Entry<String,String>entry=itr.next();
			System.out.println("Answer:"+entry.getKey()+"Posted by:"+entry.getValue());
		}
		
	}

}

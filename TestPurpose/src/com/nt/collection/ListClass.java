package com.nt.collection;

import java.util.HashSet;
import java.util.Set;

public class ListClass {

	public static void main(String[] args) {
		Set <String>list=new HashSet<String>();
		System.out.println(list.add("DK"));
		System.out.println(list.add("DK"));
		System.out.println(list.add("DK"));
		System.out.println(list.add("DK "));
		
		System.out.println(list.add("DK"));
		System.out.println(list.add("DK"));System.out.println(list.add("DK"));
		System.out.println(list.add("DK"));

		/*list.add("DK");
		list.add("DK");
		list.add("DK");
		list.add("DK");
		list.add("DK");
		list.add("DK");*/
		System.out.println(list.size());
	}

}

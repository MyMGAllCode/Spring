package com.nt.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapCollection {
	public static void main(String[] args) {
		HashMap<Integer, String>map=new HashMap<Integer,String>();
		map.put(5, "DK5");
		
		map.put(3, "DK3");
		
		map.put(78, "DK78");
		map.put(1001, "DK97");
		map.put(7, "DK7");
		map.put(0, "DK0");
		map.put(9, "DK9");
		
		map.put(1, "DK1");
		map.put(4, "DK4");
		
		System.out.println("Before Sorting"+map);
		System.out.println(map);
	/*Set<Entry<Integer, String>>set =map.entrySet();
	List<Entry<Integer,String>> list =new ArrayList<Entry<Integer,String>>(set);
	Collections.sort(list, new Comparator<Map.Entry<Integer, String>>(){

		@Override
		public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
			
			return (o1.getValue()).compareTo(o2.getValue());
		}
		
	});*/
		
		Map<Integer, String>map1=new TreeMap(map);
		;
		System.out.println("After Sorting"+map1);
		
		
	}

}

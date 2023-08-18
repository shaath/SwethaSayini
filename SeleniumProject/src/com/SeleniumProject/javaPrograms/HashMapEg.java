package com.SeleniumProject.javaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapEg {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<>();
		
		hm.put(200, "Selenium");
		hm.put(400, "Apple");
		hm.put(3, "Manual");
		
		System.out.println(hm.size());
		
		System.out.println(hm.get(400));
		
		System.out.println(hm.entrySet());
		
		for(Entry<Integer, String> x: hm.entrySet()){
			System.out.println(x.getKey()+"-----"+x.getValue());
		}

	}

}

package com.SeleniumProject.javaPrograms;

import java.util.HashSet;

public class HashSetEg {

	public static void main(String[] args) {
		
		HashSet<Object> hs = new HashSet<Object>();
		
		hs.add("Selenium");
		hs.add("Apple");
		hs.add("Boll");
		hs.add("Sharat");
		hs.add("Selenium");
		
		for(Object x: hs){
			System.out.println(x);
		}

	}

}

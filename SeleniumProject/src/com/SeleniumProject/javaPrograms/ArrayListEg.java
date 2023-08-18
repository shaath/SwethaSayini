package com.SeleniumProject.javaPrograms;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<>();
		
		al.add("Selenium");
		al.add(4000);
		al.add(true);
		al.add(444.55);
		al.add("Selenium");
		al.add(5, "Apple");
//		al.add(2, "Boll");
		al.set(1, 7750000);
//		al.clear();
//		al.remove(444.55);
//		al.contains("Selenium");
		
		System.out.println(al.size());
		
//		System.out.println(al.get(2));
		
		for(Object d: al){
			System.out.println(d);
		}

	}

}

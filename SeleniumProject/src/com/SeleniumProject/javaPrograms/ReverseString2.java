package com.SeleniumProject.javaPrograms;

public class ReverseString2 {

	public static void main(String[] args) {
		
		String course = "Selenium";
		
//		StringBuilder swetha = new StringBuilder();
//		swetha.append(course);
//		
//		StringBuilder rev = swetha.reverse();
//		System.out.println(rev);
		
		StringBuffer sf = new StringBuffer(course);
		System.out.println(sf.reverse());
		
	}
}

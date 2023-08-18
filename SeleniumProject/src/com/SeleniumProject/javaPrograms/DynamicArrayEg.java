package com.SeleniumProject.javaPrograms;

public class DynamicArrayEg {

	public static void main(String[] args) {
		
		Object[] x = new Object[5];

		System.out.println(x.length);
		
		x[1] = "Selenium";
		x[3] = 200000;
		x[1] = "Swetha";
		x[5] = "Apple";
		
//		System.out.println(x[1]);
		for (int i = 0; i < x.length; i++) 
		{
			System.out.println(x[i]);
		}
		
	}

}

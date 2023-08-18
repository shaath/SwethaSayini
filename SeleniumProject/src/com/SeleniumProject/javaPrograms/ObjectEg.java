package com.SeleniumProject.javaPrograms;

public class ObjectEg {

	public static void main(String[] args) {
		
		Object[] data = {"Selenium", 'M', 43546, 2352.54425, false};
		
		System.out.println(data.length);
		
		
		for(Object d: data){
			System.out.println(d);
		}
		
		System.out.println("**********************************");
		Object[] x = data.clone();
		for(Object d: x){
			System.out.println(d);
		}

	}

}

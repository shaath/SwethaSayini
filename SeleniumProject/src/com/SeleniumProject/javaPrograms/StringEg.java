package com.SeleniumProject.javaPrograms;

public class StringEg {

	public static void main(String[] args) {
		String course = "Selenium";
		
//		System.out.println(course.length());
//		System.out.println(course.charAt(2));
//		System.out.println(course.indexOf('e'));
//		System.out.println(course.lastIndexOf("len"));
//		System.out.println(course.indexOf('e', 2));
		
//		System.out.println(course.substring(2, 5));
		
//		System.out.println(course.toUpperCase());
//		System.out.println(course.toLowerCase());
		
//		String x = course.trim();
//		System.out.println(x.length());
		
//		System.out.println(course.replace('e', 'x'));
//		System.out.println(course.replace("len", ""));
//		System.out.println(course.replaceAll("n", "xxx"));
//		System.out.println(course.replaceFirst("e", "swetha"));
		
//		System.out.println(course.equals("Selenium"));
//		System.out.println(course.equalsIgnoreCase("selenIum"));
		
//		System.out.println(course.contains("len"));
//		System.out.println(course.startsWith("sel"));
		
//		System.out.println(course.endsWith("ium"));
		
//		boolean flag = course.endsWith("ium");
		
//		String x = "You are selected " + course;
//		System.out.println(x);
		
//		String y = course.concat(" is a Functional automation testing tool");
//		System.out.println(y);
		
//		String z = course.join(" ", course, "UFT", "Manual", "RFT", "AccelQ", "Python");
//		System.out.println(z);
		
		String x = "I am Learning Java";
		String[] y = x.split(" ");
		
//		System.out.println(y[3]);
		for(String data: y){
			System.out.println(data);
		}
		
	}

}

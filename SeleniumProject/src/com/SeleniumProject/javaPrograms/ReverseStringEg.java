package com.SeleniumProject.javaPrograms;

public class ReverseStringEg {

	public static void main(String[] args) {
		// polindrome
		String course = "Malayalam";
		int len = course.length();
		String rev = "";

		for(int i = len - 1; i >= 0; i--)
		{
//			System.out.print(course.charAt(i));
			rev = rev + course.charAt(i);
		}
		
		System.out.println(rev);
		if (course.equalsIgnoreCase(rev)) {
			System.out.println("Given String is a polindrome");
		}else{
			System.out.println("Given String is not a polindrome");
		}
	}

}
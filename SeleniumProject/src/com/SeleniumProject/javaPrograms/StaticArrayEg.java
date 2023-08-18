package com.SeleniumProject.javaPrograms;

public class StaticArrayEg {

	public static void main(String[] args) {
		String[] mName = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", 
				"Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		
		System.out.println(mName.length);
		
//		System.out.println(mName[10]);
		
//		for(int i = 0; i < mName.length; i++)
//		{
//			System.out.println(mName[i]);
//		}
		
		for(String data: mName)
		{
			System.out.println(data);
		}
	}

}

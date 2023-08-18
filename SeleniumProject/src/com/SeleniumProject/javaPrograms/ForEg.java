package com.SeleniumProject.javaPrograms;

public class ForEg {

	public static void main(String[] args) {
	       // Initialization ; Condition; Incrementor/Decrementor
//		for(int i = 1; i <= 10; i++)
//		{
//			System.out.println("Hi");
//		}
		
//		for(int i = 1; i <= 100; i++)
//		{
//			System.out.println(i);
//			if(i == 75)
//			{
//				break;
//			}
//		}
		
//		for(int i = 100; i >= 1; i--)
//		{
//			System.out.println(i);
//			if(i == 75)
//			{
//				break;
//			}
//		}
		
//		for(char c = 'a'; c <= 'z'; c++){
//			System.out.println(c);
//		}
		
		for(int i = 0; i < 5; i++)
		{
			for(int j = i; j >= 0; j--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}

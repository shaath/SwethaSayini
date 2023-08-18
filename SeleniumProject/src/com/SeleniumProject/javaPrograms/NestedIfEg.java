package com.SeleniumProject.javaPrograms;

public class NestedIfEg {

	public static void main(String[] args) {
		
		int a = 2000;
		int b = 2000;
		int c = 40;
		
		if(a > b && a > c) {
			System.out.println("A is Greater");
		}
		else if(b > c && b > a){
			System.out.println("B is Greater");
		}
		else if(c > a && c > b){
			System.out.println("C is Greater");
		}
		else{
			System.out.println("Assisgn proper values to the variables / Avoid duplicates");
		}

	}

}

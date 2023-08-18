package com.SeleniumProject.javaPrograms;

public class InterfaceReuseEg {

	public static void main(String[] args) {
		
		InterfaceEg ie1 = new InterfaceImplementsEg1();
		ie1.Vehicle();
		
		InterfaceEg ie2 = new InterfaceEgImplementsEg2();
		ie2.Vehicle();

	}

}

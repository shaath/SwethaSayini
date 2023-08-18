package com.SeleniumProject.javaPrograms;

public class MethodsReuseEg {

	public static void main(String[] args) {
		
		int num1 = 40;
		int num2 = 99;
		
//		MethodsEg.Function1();
		
		MethodsEg me = new MethodsEg();
		me.Function3();
		
		int res = me.sum(num1, num2);
		System.out.println(res);

		res = me.sum(20, 30, 40);
		System.out.println(res);
	}

}

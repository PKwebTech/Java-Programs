package com.progarms;

public class DivideByZero {

	public static void main(String[] args) {
		int a=10,b=0,c=0;
		System.out.println("Before Division");
		try {
		c=a/b;  // run time error divide by zero
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("After Division ");
	}

}

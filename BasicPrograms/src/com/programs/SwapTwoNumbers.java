package com.programs;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// using temp variable
		int a,b,temp;
		a=20;
		b=40;
		System.out.println("Befor Swapning a = "+a+ "and b= "+b);
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("After Swapning a = " +a+ "and b= "+b);

	}

}

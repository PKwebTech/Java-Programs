package com.programs;

public class SwapNumberWithoutTemp {

	public static void main(String[] args) {
		
		int a,b;
		a=20;
		b=40;
		System.out.println("Befor Swapning a= "+a+ " and b= "+b);
		
		a=a+b; // a=20+40=60;
		b=a-b; // b=60-40=20;
		a=a-b; // a=60-20=40;
		
		System.out.println("After Swapning a= "+a+ " and b= "+b);
	}

}

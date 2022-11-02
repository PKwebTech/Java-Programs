package com.programs;

public class LargetOfThree {

	public static void main(String[] args) {
		int a,b,c,largest;
		a=40;
		b=50;
		c=30;
		
		largest=(a>b && a>c)?a: (b>a && b>c)?b : c;
		System.out.println("Larget Of "+a+","+b+","+c+" = "+largest);
		

	}

}

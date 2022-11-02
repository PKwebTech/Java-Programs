package com.programs;

public class LargestOfFour {

	public static void main(String[] args) {
		int a,b,c,d,largest;
		a=10;
		b=90;
		c=30;
		d=40;
		
		largest=(a>b && a>c && a>d)?a : (b>a && b>c && b>d)?b :(c>a && c>b && c>d)?c:d;
		System.out.println("Largest Of "+a+","+b+","+c+","+d+" = "+largest);

	}

}

package com.programs;

public class LargestOfFive {

	public static void main(String[] args) {
		int a,b,c,d,e,largest;
		a=10;
		b=90;
		c=30;
		d=40;
		e=50;
		
		largest=(a>b && a>c && a>d && a>e)?a:(b>a && b>c && b>d && b>e)?b:(c>a && c>b && c>d && c>e)?c:(d>a && d>b && d>c && d>e)?d:e;
		System.out.println("Largest Of "+a+","+b+","+c+","+d+ ","+e+" = "+largest);

	}

}

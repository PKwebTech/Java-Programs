package com.programs;

import java.util.Scanner;

public class LargestOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter First Number :");
		a=sc.nextInt();
		System.out.println("Enter Second Number :");
		b=sc.nextInt();
		
		if(a==b) {
			System.out.println(a +" , "+ b +" both are equal");
		}
		else if(a>b)
		{
			System.out.println(a +" Is largest Number");
		}
		else
		{
			System.out.println(b +" Is Largest Number");
		}
		

	}

}

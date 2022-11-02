package com.programs;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t,f1=1,f2=1,n=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No Of Terms ");
		t=sc.nextInt();
		System.out.println("Fobonacci Series");
		System.out.println(f1);
		System.out.println(f2);
		
		while(n<=t-2)
		{
			int f3=f1+f2;
			System.out.println(f3);
			f1=f2;
			f2=f3;
			n++;
		}
		

	}

}

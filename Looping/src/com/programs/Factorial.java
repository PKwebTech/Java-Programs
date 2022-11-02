package com.programs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number tofind Factorial");
		num=sc.nextInt();
		int f=1;
		while(num>=1)
		{
			f*=num;
			num--;
		}
		System.out.println("Factorial  = "+f);

	}

}

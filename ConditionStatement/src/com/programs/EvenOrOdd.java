package com.programs;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number ");
		num=sc.nextInt();
		if(num==0)
		{
			System.out.println(num+" Is a Zero");
		}
		else if(num%2==0)
		{
			System.out.println(num+" Is a Even");
		}
		else
		{
			System.out.println(num+" Is a Odd");
		}

	}

}

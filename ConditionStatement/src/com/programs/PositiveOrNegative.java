package com.programs;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number.");
		num=sc.nextInt();
		if(num>0)
		{
			System.out.println(num+" Number Is Positive");
		}
		else {
			System.out.println(num+" Number is Negative");
		}
		

	}

}

package com.programs;

import java.util.Scanner;

public class EvenOddUsingSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,num1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		num=sc.nextInt();
		num1=num%2;
		
		switch(num1) {
		case 0:
			System.out.println(num +" Is Even Number");
		       break;
		case 1: 
			System.out.println(num + " Is Odd Number");
			  break;
		
			
		}

	}

}

package com.programs;

import java.util.Scanner;

public class ZeroOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		num=sc.nextInt();
		if(num==0)
		{
			System.out.println(num + "  Is Zero");
		}
		else {
			System.out.println(num + "  Is Not Zero");
		}

	}

}

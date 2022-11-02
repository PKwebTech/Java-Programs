package com.programs;

import java.util.Scanner;

class Largest{
	int a,b,c;
	void inputData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Three Number :");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
	}
	void checkLargest()
	{
		if(a>b && a>c)
		{
			System.out.println(" The Largest Of "+a+ ","+b+ " and " + c+ " : " +a);
		}
		else if(b>a && b>c)
		{
			System.out.println(" The Largest Of "+a+ ","+b+ " and " + c+" : " +b);
		}
		else {
			System.out.println(" The Largest Of "+a+ ","+b+ " and " + c+" : " +c);
		}
	}
}

public class LargestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Largest lob=new Largest();
		lob.inputData();
		lob.checkLargest();
		

	}

}

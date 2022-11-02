package com.programs;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		int Age;
		float fees;
		String name;
		char gen;
		
		// get data 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name :");
		name=sc.nextLine();
		System.out.println("Enter Fees :");
		fees=sc.nextFloat();
		System.out.println("Enter Age");
		Age=sc.nextInt();
		System.out.println("Enter Gender M/F");
		gen=sc.next().charAt(0);
		
		//Display Data
		System.out.println("************ Student Information*************");
		System.out.println("Name : "+name);
		System.out.println("Age : "+Age);
		System.out.println("Fees :"+fees);
		System.out.println("Gender : "+gen);
		
		

	}

}

package com.programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count+=1;
			}
		}
		
		if(count==2) {
			System.out.println(num +" Is Prime Number");
		}
		else {
			System.out.println(num +" Is Not Prime Number");
		}

	}

}

package com.programs;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,d;
		int rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        num=sc.nextInt();
        int temp=num;
        while(num!=0) {
        	d=num%10;
        	rev=rev*10+d;
        	num=num/10;
        }
        System.out.print(rev);
        if(rev==temp)
        {
        	System.out.println(" Is Palindrome");
        }
        else {
        	System.out.println(" Is Not Palindrome");
        }

	}

}

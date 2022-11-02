package com.programs;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
	   int num,sum=0,temp;
	   
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter The Number");
	   num=sc.nextInt();
	   temp=num;
	   
	   while(num>0) {
		    int  d=num%10;
		    sum+=d*d*d;
		    num=num/10;
	   }
	  
	   if(temp==sum) {
		   System.out.println(temp+" Number Is Armstrong Number");
	   }else {
		   System.out.println(temp+" Number Is Not Armstrong Number");
	   }

	}

}

package com.programs;

public class ArithmeticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,ans;
		
		num1=20;
		num2=40;
		
		// sum
		ans=num1+num2;
		System.out.println("Sum Of "+ num1 + " and " + num2 + " is " + ans);
		
		// Difference
		ans=num1-num2;
		System.out.println("Difference Of "+ num1 + " and " + num2 + " is " + ans);
		
		// Product
		ans=num1*num2;
		System.out.println("Product Of "+ num1 + " and " + num2 + " is " + ans);
		
		// Quotient
        ans=num1/num2;
		System.out.println("Quotient Of "+ num1 + " and " + num2 + " is " + ans);
		
		// Remainder
        ans=num1%num2;
		System.out.println("Remainder Of "+ num1 + " and " + num2 + " is " + ans);

	}

}

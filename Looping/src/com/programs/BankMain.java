package com.programs;

import java.util.Scanner;

class Bank{
	float amount;
	Bank(){
		amount=1000;
	}
	void deposit(float damount) {
		amount+=damount;
		System.out.println("After Deposite Balance is "+amount +" RS");
	}
	void withdraw(float wamount) {
		if(wamount>amount) {
			System.out.println("Insuficent Balance.....");
		}
		else {
			amount-=wamount;
			System.out.println("After Withdraw Balance is "+amount +" RS");
		}
	}
	void displayBalance() {
		System.out.println("Your Balance is "+amount +" RS");
	}
}
public class BankMain {

	public static void main(String[] args) {
		Bank bob=new Bank();
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("**************** MY ATM *****************");
		
		while(true) {
		System.out.println("1. Deposit Amount");
		System.out.println("2. Withdraw Amount");
		System.out.println("3. Display Balance");
		System.out.println("4. Exit");
		
		System.out.println("Please Select Your Option");
		ch=sc.nextInt();
		
		switch(ch) {
		case 1:
			   System.out.println("Enter Amount to Deopsit");
			   float damt=sc.nextFloat();
			   bob.deposit(damt);
			   break;
		case 2:
			   System.out.println("Enter Amount to Withdraw");
			   float wamt=sc.nextFloat();
			   bob.withdraw(wamt);
			   break;
		case 3:
			   bob.displayBalance();
			   break;
		case 4:
			  System.out.println("Thank You For Visit............");
			  System.exit(0);
		}
		}

	}

}

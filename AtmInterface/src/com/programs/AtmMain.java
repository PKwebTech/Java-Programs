package com.programs;

import java.util.Scanner;

class ATM{
	private float totalamt;
	private int pin;
	private long accno;
	private long mobile;
     
     // set default details of user
	
     ATM(){
    	 this.totalamt=10000f;
    	 this.pin=1234;
    	 this.accno=123456789l;
    	 this.mobile=9876543210l;
     }
	 Scanner sc=new Scanner(System.in);
	 // checking pin of ATM
	 
	 int checkPin() {
		 System.out.println("Enter Your Pin");
		 int pin=sc.nextInt();
		 if(pin==this.pin) {
			 facilities();
			 return 1;
		 }else {
			 System.out.println("Incorrect Pin....");
			 return 0;
		 }
		
	 }
	 //  ATM facilities
	 
	 void facilities() {
		 while(true) {
		 System.out.println("**************************************************");
		 System.out.println("                     ATM                          ");
		 System.out.println("--------------------------------------------------");
		 System.out.println("1.Deposit            2.Withdraw");
		 System.out.println("3.Balance Inquire    4.Mini Statement");
		 System.out.println("5.Money Transfer     6.Exit  ");
		 System.out.println("Select Option");
		 System.out.println("**************************************************");
		 int choice=sc.nextInt();
		 switch(choice) {
		 case 1:
			   deposit();
			   break;
		 case 2:
			   Withdraw();
			   break;
		 case 3:
			   balanceInq();
			   break;
		 case 4:
			   System.out.println("Mini Statement");
			   break;
		 case 5:
			   System.out.println("Money Transfer");
			   break;
		 case 6:
			   break;
		 default:
			  System.out.println("Please Enter Valid Choice.");
		 }
		 if(choice==6) {
			 System.out.println("Thank You For Visiting...........");
			 break;
		 }
		 
	 }
	 }
	 // Deposit Money
	 
	 void deposit() {
		 System.out.println("Enter Amount to Deposit.");
		 float damount=sc.nextFloat();
		 totalamt+=damount;
		 System.out.println(damount+".RS Deposit In Your Account Sucessfully.");
		 System.out.println("Total Balanace is : "+totalamt+".RS");
	 }
	 // Withdraw Money
	 
	 void Withdraw() {
		 System.out.println("Enter Amount To Withdraw");
		 float wamount=sc.nextFloat();
		 if(totalamt>wamount) {
			 totalamt-=wamount;
			 System.out.println(wamount+".RS Withdraw Sucessfully.");
			 System.out.println("Avaible Balance : "+totalamt+".RS");
		 }
		 else {
			 System.out.println("Insufficient Balance In Your Account.");
		 }
	 }
	 //Balance Inquire
	 
	 void balanceInq() {
		 System.out.println("Total Balance : "+totalamt+".RS");
	 }
	 
}
public class AtmMain {

	public static void main(String[] args) {
		ATM aob=new ATM();
		int flag=-1;
		int count=3;
		
		// check pin attempt
		
		while(count>0) {
		flag=aob.checkPin();
		if(flag==1) {
			break;
		}
		else {
			count--;
			System.out.println("You Have  "+count+" attempt");
		}
		if(count==0) {
			System.out.println("Your ATM Card Has Been Blocked....");
			System.out.println("Please Viste Your Branch.");
		}
		}
		

	}

}

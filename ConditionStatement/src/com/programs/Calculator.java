package com.programs;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		  int ch,ch1;
		  float n1,n2,ans;
		  Scanner sc=new Scanner(System.in);
		  do {
		System.out.println("**************** Calculator ****************");
		System.out.println(" Enter Your Choice ");
		System.out.println("1. Addition");
		System.out.println("2. Substration");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("Enter Your Choice");
		ch=sc.nextInt();
		
	    System.out.println("Enter Two Numbers");
	    n1=sc.nextFloat();
	    n2=sc.nextFloat();
	    
	    switch(ch) {
	    case 1:
	    	   ans=n1+n2;
	    	   System.out.println("Addition Of " +n1+ " , " +n2+ " = "+ans );
	    	   break;
	    case 2:
	    	   ans=n1-n2;
	    	   System.out.println("Substration Of " +n1+ " , " +n2+ " = "+ans );
	    	   break;
	    case 3:
	    	   ans=n1*n2;
	    	   System.out.println("Multiplication Of " +n1+ " , " +n2+ " = "+ans );
	    	   break;
	    case 4:
	    	  if(n2!=0)
	    	  {
	    	   ans=n1/n2;
	    	   System.out.println("Addition Of " +n1+ " , " +n2+ " = "+ans );
	    	  }
	    	  else {
	    		  System.out.println("Cannot Divide By 0");
	    	  }
	    	   break;
	    default:
	    	System.out.println("Please Enter Valid Input");
	    }
	      System.out.println("Do You Want To Continue y/n");
	      ch1=sc.next().charAt(0);
		  } while(ch1!='n');
		  System.out.println("Program Terminated");
		
		

	}

}

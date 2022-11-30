package com.programs;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("************Database Operations*******************");
		System.out.println("1.Display Records");
		System.out.println("2.Insert Records");
		System.out.println("3.Update Record");
		System.out.println("4.Delete Record");
		
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		
		switch(ch) {
		case 1:System.out.println("Display Record");
		          DatabaseAllOperations.displayRecord();
		         break;
		case 2: System.out.println("Insert Record");
		          DatabaseAllOperations.insertRecord();
		        break;
		case 3:System.out.println("update Records");
	            	DatabaseAllOperations.updateRecord();
        break;
         case 4: System.out.println("Delete Record");
                DatabaseAllOperations.deleteRecord();
         break;
         default :System.out.println("Invalid input");
		  
		} //switch
		
		System.out.println("Do you want to continue , press n to exit and any key to continue");
		char choice=sc.next().charAt(0);
		if(choice=='n') { 
			break;
		}
		
		}//while(true
		
		System.out.println("Program is terminated");

	}//main

}//class
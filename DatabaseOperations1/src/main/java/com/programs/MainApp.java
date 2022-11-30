package com.programs;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// Show Menu
		while(true) {
		System.out.println("**************** Database Opeartions****************");
		System.out.println("1. Display Records");
		System.out.println("2. Insert Records");
		System.out.println("3. Update Records");
		System.out.println("4. Delete REcords");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Choice");
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1:
		      System.out.println("Display Record");
		      DatabaseOpeartion.displayRecord();
		      break;
		case 2:
		      System.out.println("Insert Record");
		      DatabaseOpeartion.insertRecord();
		      break;
		case 3:
		      System.out.println("Update Record");
		      DatabaseOpeartion.upadteRecord();
		      break;
		case 4:
		      System.out.println("Delete Record");
		      DatabaseOpeartion.deleteRecord();
		      break;
		default:
			  System.out.println("Enter Valid Choice");
		      
		}
		System.out.println("Do you want to continue y/n");
		char ch=sc.next().charAt(0);
		if(ch=='n') {
			break;
		}
		sc.close();

	}
	
	}

}

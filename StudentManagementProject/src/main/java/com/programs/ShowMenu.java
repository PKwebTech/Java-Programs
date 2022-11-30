package com.programs;

import java.sql.SQLException;
import java.util.Scanner;

public class ShowMenu {
     public static void showMenu() throws SQLException {
    	 Scanner sc=new Scanner(System.in);
    	while(true) {
    		System.out.println("1.Add New Student           2.Show All Student");
    		System.out.println("3.Update Student            4.Delete Student");
    		System.out.println("5.Get Status Of Student     6.DashBoard");
    		System.out.println("Enter Your Choice");
    	    int choice =sc.nextInt();
    	    
    	    switch(choice) {
    	    case 1:
    	    	  System.out.println("Add New Student");
    	    	  DatabaseOperations.addStudent();
    	    	  break;
    	    case 2:
    	  	      System.out.println("Show All Student");
    	  	      DatabaseOperations.displayAllStudent();
    	  	      break;
    	    case 3:
    	    	  System.out.println("Update Student ");
    	    	  DatabaseOperations.updateStudent();
    	    	  break;
    	    case 4:
    	    	  System.out.println("Delete Student");
    	    	  DatabaseOperations.deleteStudent();
    	    	  break;
    	    case 5:
    	    	  System.out.println("Status Of Student");
    	    	  DatabaseOperations.getStatus();
    	    	  break;
    	    case 6:
  	    	  System.out.println("DashBoard");
  	    	  DashBoard.getStatus();
  	    	  break;
    	    	  
    	   }
    	    System.out.println();
    	    System.out.println("Do You Want To Continue... press y/n");
    	    char ch=sc.next().charAt(0);
    	    if(ch=='n') {
    	    	break;
    	    }
    	
    	}
     }
}

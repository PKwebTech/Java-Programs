package com.programs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentMain {
	    private static Connection conn;
	    private static PreparedStatement pst;
	    private static ResultSet rs;
	    
	    public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		// Show menu
		System.out.println("*************** Student Management System******************");
		while(true) {
		System.out.println("Select Login Option");
		System.out.println("1.Admin       2.Student");
		int loginch=sc.nextInt();
		
		switch(loginch) {
		case 1:
			  while(true) {
				  try {
						conn=DatabaseConnection.getConnection();
						System.out.println("Enter UserName");
						String username=sc.next();
						System.out.println("Enter Password");
						String pass=sc.next();
						String s="select * from admin where username=? and password=?";
						pst=conn.prepareStatement(s);
						pst.setString(1, username);
						pst.setString(2, pass);
						rs=pst.executeQuery();
						if(rs.next()) {
							ShowMenu.showMenu();
							break;
						}
						else {
							System.out.println("Username and password Incorrect...");
						}
					}
					catch(Exception e) {
						e.printStackTrace();
					}
			  }
			  System.out.println();
			  break;
			 
		case 2:
			  System.out.println("Welcome To Student Section");
			  DatabaseOperations.getStatus();
			  break;
		default:
			  System.out.println("Enter Valid Choice");
		}
		System.out.println("Do You Want to Cotinue press y/n");
		char ch=sc.next().charAt(0);
		if(ch=='n') {
			break;
		}
		}
		
	}
	

}

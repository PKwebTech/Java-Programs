package com.programs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class CheckValidation {
	// set connection requirement
	private static Connection conn;
	private static PreparedStatement pst;
	private static ResultSet rs;
	 static Scanner sc=new Scanner(System.in);
	 
	// check course fees.
	public static float validFees(int cid) {
		float amt=0.0f;
	    while(true) {
	    	 try {
	   		  conn=DatabaseConnection.getConnection();
	   		  System.out.println("Enter Amount To Pay");
	   		  amt=sc.nextFloat();
	   		  String s="select * from course where cid=?";
	   		  pst=conn.prepareStatement(s);
	   		  pst.setInt(1, cid);
	   		  rs=pst.executeQuery();
	   		  if(rs.next()) {
	   			  if(amt>rs.getFloat(3)) {
	   				  System.out.println("Enter Valid Course Fees.");
	   			  }
	   			  else {
	   				   break;
	   			}
	   		  }else {
	   			  System.out.println("Course Not Found.");
	   		  }
	   			 
	   	    }catch(Exception e) {
	   		  e.printStackTrace();
	   	  }
	    }
		   
	    return amt;
	}

	// check student exists or not 
	public static int checkStudent(long mobile,String email) {
		try {
			conn=DatabaseConnection.getConnection();
			String s="select * from student where semail=? and smobile=?;";
			  pst=conn.prepareStatement(s);
			  pst.setString(1, email);
			  pst.setLong(2, mobile);
	   		  rs=pst.executeQuery();
	   		  if(rs.next()) {
	   			 System.out.println("Student Already Exists");
	   			 return -1;
	   		  }else {
	   			  
	   		  }
		}catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

}

package com.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DatabaseAllOperations {
  private static Connection conn=null;
  private static Statement st=null;
  private static ResultSet rs=null;
	public static void displayRecord() {
		try {
	       conn=DatabaseConnection.getConnection();	
	       Statement st=conn.createStatement();
			
			String s="select * from emp";
			
			ResultSet rs=st.executeQuery(s);
			System.out.println("Eid\tEname\tDeptId");
			System.out.println("----------------------------------");
			while(rs.next()) {
				//System.out.println(rs.getInt("eid")+"\t"+rs.getString("ename")+"\t"+rs.getInt("deptid"));
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
			}
			
		  }catch(Exception e) {
			e.printStackTrace();
		}
	        
	        
		
	}

	public static void insertRecord() {
		try {
			conn=DatabaseConnection.getConnection();
			st=conn.createStatement();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter name");
			String n=sc.next();
			System.out.println("Enter Employee id");
			int id=sc.nextInt();
			System.out.println("Enter dept id");
			int did=sc.nextInt();
			
			String s="select * from  emp where eid="+id;
			//to check whether eid exits
			rs=st.executeQuery(s);//select
			if(rs.next()) {
				System.out.println("Employee id already exists");
			} //if eid is there not go to insert
			else {
				
				String ins="insert into emp values("+id+",'"+n+"',"+did+")";
				int i=st.executeUpdate(ins);//insert, update and delete 
				if(i>0) {
					System.out.println("Record is inserted");
				}else {
					System.out.println("Record not inserted");
				}
				
			}
			
			}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void updateRecord() {
		try {
			
			 conn=DatabaseConnection.getConnection();
			 st=conn.createStatement();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter name to change");
			String n=sc.nextLine();
			System.out.println("Enter Employee id");
			int id=sc.nextInt();
			
			
			String s="select * from  emp where eid="+id;
			//to check whether eid exits
			rs=st.executeQuery(s);//select
			if(rs.next()) {
				//if employee id exits then go for delete
				
				String up="update emp set ename='"+n+"' where eid="+id;
				//update emp set ename='siva' where eid=1121
				int i=st.executeUpdate(up);
				if(i>0) {
					System.out.println("Name is changed");
				}else {
					System.out.println("Some error occurred");
				}
			}else {
				System.out.println("Employee id not exits update is not possible");
			}
			
			}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void deleteRecord() {
		try {
			
			 conn=DatabaseConnection.getConnection();
			 st=conn.createStatement();
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter Employee id");
			int id=sc.nextInt();
			
			
			String s="select * from  emp where eid="+id;
			//to check whether eid exits
			rs=st.executeQuery(s);//select
			if(rs.next()) {
				//if employee id exits then go for delete
				String del="delete from emp where eid="+id;
				int i=st.executeUpdate(del);
				if(i>0) {
					System.out.println("Record is deleted");
				}else {
					System.out.println("Some error occurred");
				}
			}else {
				System.out.println("Employee id not exits deletion is not possible");
			}
			
			}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	
}

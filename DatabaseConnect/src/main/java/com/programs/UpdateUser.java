package com.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateUser {
     static String driver="com.mysql.cj.jdbc.Driver";
     static String un="root";
     static String pass="root";
     static String url="jdbc:mysql://localhost:3306/afternoon_batch";
     
     static Connection conn;
     static Statement st;
     static ResultSet rs;
	public static void main(String[] args) {
		try {
			conn=DriverManager.getConnection(url,un,pass);
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter User Name");
			String uname=sc.next();
			String s="select * from login1 where username='"+uname+"'";
			st=conn.createStatement();
			rs=st.executeQuery(s);
			if(rs.next()) {
				System.out.println("Enter password to update");
				String pass=sc.next();
				String up="update login1 set password='"+pass+"' where username='"+uname+"'";
					st=conn.createStatement();
					int i=st.executeUpdate(up);
					if(i>0) {
						System.out.println("Password Update");
					}else {
						System.out.println("Password Not Update");
					}
			}else {
			  System.out.println("Record Not Found.");
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}

package com.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Login {
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
				System.out.println("Already User Exists");
			}else {
				System.out.println("Enter Password");
				String pass=sc.next();
				
				String ins="insert into login1 values ('"+uname+"','"+pass+"')";
				st=conn.createStatement();
				int i=st.executeUpdate(ins);
				if(i>0) {
					System.out.println("Record Insert");
				}else {
					System.out.println("Record Not Insert");
				}
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}

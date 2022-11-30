package com.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DisplayUser {
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
			String s="select * from login1";
			st=conn.createStatement();
			rs=st.executeQuery(s);
			System.out.println("UserName\tPassword\t");
		    while(rs.next()) {
		    	System.out.println(rs.getString(1)+"\t"+rs.getString(2));
		    }
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}

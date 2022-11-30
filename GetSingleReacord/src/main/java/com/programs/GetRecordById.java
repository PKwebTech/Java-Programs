package com.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class GetRecordById {

	public static void main(String[] args) {
        String driver="com.mysql.cj.jdbc.Driver";
        String un="root";
        String pass="root";
        String url="jdbc:mysql://localhost:3306/afternoon_batch";
        Connection conn=null;
        Statement st=null;
        ResultSet rs=null;
        
        try {
        	Class.forName(driver);
        	 conn=DriverManager.getConnection(url,un,pass);
        	 st=conn.createStatement();
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Enter Employee ID");
        	int id=sc.nextInt();
        	String s="Select * from emp where eid="+id;
        	 rs=st.executeQuery(s);
        	if(rs.next()) {
        		System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
        	}else {
        		System.out.println("Employee Not Exists");
        	}
        	
        }catch(Exception e) {
        	e.printStackTrace();
        }

	}

}

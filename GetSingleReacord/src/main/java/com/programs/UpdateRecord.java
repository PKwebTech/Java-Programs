package com.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateRecord {

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
			String up="update emp set ename='"+n+"',deptid='"+did+"' where eid="+id;
			int i=st.executeUpdate(up);
			if(i>0) {
				System.out.println("Record Update");
			}
			else {
				System.out.println("Not Upate");
			}
		} //if eid is there not go to insert
		else {
			
			System.out.println("Id Not Found Update not possible");
			
		}
		
		}catch(Exception e) {
		e.printStackTrace();
	}

}

}

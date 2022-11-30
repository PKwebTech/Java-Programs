package com.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.Scanner;




public class DeleteRecord {
 public static void main(String[] args) {
	 String driver="com.mysql.cj.jdbc.Driver";
		String un="root";
		String pass="root";
		String url="jdbc:mysql://localhost:3306/afternoon_batch";
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {
			Class.forName(driver);
			 conn=DriverManager.getConnection(url,un,pass);
			 
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter Employee id");
			int id=sc.nextInt();
			
			
			String s="select * from  emp where eid=?";
			pst=conn.prepareStatement(s);
			pst.setInt(1, id);
			//to check whether eid exits
			rs=pst.executeQuery();//select
			if(rs.next()) {
				
				//String up="update emp set ename='"+n+"' where eid="+id;
				String up="delete from emp where eid=?";
				
				pst=conn.prepareStatement(up);
				pst.setInt(1, id);
				int i=pst.executeUpdate();
				if(i>0) {
					System.out.println("Record is deleted");
				}else {
					System.out.println("Some error occurred");
				}
			}else {
				System.out.println("Employee id not exits Delete is not possible");
			}
			
			}catch(Exception e) {
			e.printStackTrace();
		}

	}

	}


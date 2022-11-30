package com.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class GetRecords {

	public static void main(String[] args) {
		/*
		 * 1.load driver
		 * 2.create connection
		 * 3.create a statement object
		 * 4.execute query
		 * */
        String driver="com.mysql.cj.jdbc.Driver";
        String un="root";
        String pass="root";
        String url="jdbc:mysql://localhost:3306/afternoon_batch";
        
        try {
        	//load driver
        	Class.forName(driver);
        	//create connection
        	Connection conn=DriverManager.getConnection(url,un,pass);
        	Statement st=conn.createStatement();
        	String s="Select * from emp";
        	
        	ResultSet rs=st.executeQuery(s);
        	System.out.println("Eid\tEname\tDeptId");
        	System.out.println("--------------------------------");
        	while(rs.next()) {
        		//System.out.println(rs.getInt("eid")+"\t"+rs.getString("ename")+"\t"+rs.getInt("deptid"));
        		System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
        	}
        	
        	
        }catch(Exception e) {
        	e.printStackTrace();
        }
	}

}

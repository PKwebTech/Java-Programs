package com.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class GetStudentData {

	public static void main(String[] args) {
		String driver="com.mysql.cj.jdbc.Driver";
				String username="root";
				String pass="root";
				String url="jdbc:mysql://localhost:3306/javaproject";
				Connection conn;
				Statement st;
				ResultSet rs;

				try{
				  Class.forName(driver);
				  conn=DriverManager.getConnection(url,username,pass);
				  st=conn.createStatement();
				  String s="select * from student";
				  rs=st.executeQuery(s);
				  System.out.println("SID\tSName\tSEmail");
				  while(rs.next()){
				  System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
	

				}

				}catch(Exception e){

				e.printStackTrace();

				}
	}

}

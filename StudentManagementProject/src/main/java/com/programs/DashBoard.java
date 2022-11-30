package com.programs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DashBoard {
	private static Connection conn;
	private static PreparedStatement pst;
	private static ResultSet rs,rs1;
	// get current status
	public static void getStatus() {
		int total_std = 0,total_crs=0;
		float pending_fees = 0,total_fees=0;

		try {
			conn=DatabaseConnection.getConnection();
			// total student
			String s="select count(sid) from student";
			pst=conn.prepareStatement(s);
			rs=pst.executeQuery();
			if(rs.next()) {
				total_std=rs.getInt(1);
			}else {
				System.out.println("Record Not Found");
			}
			
			// total course
			String s1="select count(cid) from course";
			pst=conn.prepareStatement(s1);
			rs=pst.executeQuery();
			if(rs.next()) {
				total_crs=rs.getInt(1);
			}else {
				System.out.println("Record Not Found");
			}
			
			// total fees
			String s2="select sum(balance) from student";
			pst=conn.prepareStatement(s2);
			rs=pst.executeQuery();
			if(rs.next()) {
				total_fees=rs.getInt(1);
			}else {
				System.out.println("Record Not Found");
			}
			
			// calculate pending fees;
			String s3="select * from student";
			pst=conn.prepareStatement(s3);
			rs=pst.executeQuery();
			while(rs.next()) {
				String s4="select cfees from course where cid=?";
				pst=conn.prepareStatement(s4);
				pst.setInt(1, rs.getInt(5));
				rs1=pst.executeQuery();
				if(rs1.next()) {
					pending_fees+=rs1.getFloat(1)-rs.getFloat(6);
				}
				
			}
			System.out.println("----------------------------------");
			System.out.println("Total Student : "+total_std);
			System.out.println("Total Course  : "+total_crs);
			System.out.println("Total Fees    : "+total_fees);
			System.out.println("Pending Fees   : "+pending_fees);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

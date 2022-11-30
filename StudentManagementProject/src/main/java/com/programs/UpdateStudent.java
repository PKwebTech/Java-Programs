package com.programs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateStudent {
	// set connection requirement
	private static Connection conn;
	private static PreparedStatement pst;
	private static ResultSet rs,rs1;
    static Scanner sc=new Scanner(System.in);
    
    // update Student Name
	public static void updateName() throws SQLException {
		try {
			conn=DatabaseConnection.getConnection();
			System.out.println("Enter Student ID");
			int sid=sc.nextInt();
			String s="Select * from student where sid=?";
			pst=conn.prepareStatement(s);
			pst.setInt(1, sid);
			rs=pst.executeQuery();
			if(rs.next()) {
				System.out.println("Enter Student Name");
				String name=sc.next();
				String uname="update student set sname=? where sid=?";
				pst=conn.prepareStatement(uname);
				pst.setString(1, name);
				pst.setInt(2, sid);
				int result=pst.executeUpdate();
				if(result>0) {
					System.out.println("Student Name Update.");
				}else {
					System.out.println("Student Name Not Update");
				}
			}else {
				System.out.println("Student ID Not Found.");
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			conn.close();
			pst.close();
			rs.close();
			
		}
		
	}

	// Update Student Email
	public static void updateEmail() throws SQLException {
		try {
			conn=DatabaseConnection.getConnection();
			System.out.println("Enter Student ID");
			int sid=sc.nextInt();
			String s="Select * from student where sid=?";
			pst=conn.prepareStatement(s);
			pst.setInt(1, sid);
			rs=pst.executeQuery();
			if(rs.next()) {
				System.out.println("Enter Student Email");
				String email=sc.next();
				String uemail="update student set semail=? where sid=?";
				pst=conn.prepareStatement(uemail);
				pst.setString(1, email);
				pst.setInt(2, sid);
				int result=pst.executeUpdate();
				if(result>0) {
					System.out.println("Student Email Update.");
				}else {
					System.out.println("Student Email Not Update");
				}
			}else {
				System.out.println("Student ID Not Found.");
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			conn.close();
			pst.close();
			rs.close();
			
		}
		
	}
	
	// Update student Mobile Number

	public static void updateMobile() throws SQLException {
		try {
			conn=DatabaseConnection.getConnection();
			System.out.println("Enter Student ID");
			int sid=sc.nextInt();
			String s="Select * from student where sid=?";
			pst=conn.prepareStatement(s);
			pst.setInt(1, sid);
			rs=pst.executeQuery();
			if(rs.next()) {
				System.out.println("Enter Student Mobile");
				String mobile=sc.next();
				String umobile="update student set smobile=? where sid=?";
				pst=conn.prepareStatement(umobile);
				pst.setString(1, mobile);
				pst.setInt(2, sid);
				int result=pst.executeUpdate();
				if(result>0) {
					System.out.println("Student Mobile Update.");
				}else {
					System.out.println("Student Mobile Not Update");
				}
			}else {
				System.out.println("Student ID Not Found.");
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			conn.close();
			pst.close();
			rs.close();
			
		}
		
	}
	// update student Course

	public static void updateCourse() throws SQLException {
		try {
			conn=DatabaseConnection.getConnection();
			System.out.println("Enter Student ID");
			int sid=sc.nextInt();
			String s="Select * from student where sid=?";
			pst=conn.prepareStatement(s);
			pst.setInt(1, sid);
			rs=pst.executeQuery();
			if(rs.next()) {
				System.out.println("Choose Course");
			    System.out.println("11. Java Full Stack (RS.5000)       22. C++ (RS.2000)");
		        System.out.println("33. Python          (RS.3000)       44. DS (RS.4000)");
			    int cid=sc.nextInt();
				String ucourse="update student set cid=? where sid=?";
				pst=conn.prepareStatement(ucourse);
				pst.setInt(1, cid);
				pst.setInt(2, sid);
				int result=pst.executeUpdate();
				if(result>0) {
					System.out.println("Student Course Update.");
				}else {
					System.out.println("Student Course Not Update");
				}
			}else {
				System.out.println("Student ID Not Found.");
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			conn.close();
			pst.close();
			rs.close();
			
		}
		
	}
	//update Student Fees.

	public static void updateFees() throws SQLException {
		try {
			conn=DatabaseConnection.getConnection();
			System.out.println("Enter Student ID");
			int sid=sc.nextInt();
			String s="Select * from student where sid=?";
			pst=conn.prepareStatement(s);
			pst.setInt(1, sid);
			rs=pst.executeQuery();
			if(rs.next()) {
			while(true) {
				System.out.println("Enter Student Fees");
				float fees=sc.nextFloat()+rs.getFloat(6);
				String s1="select cfees from course where cid=?";
				pst=conn.prepareStatement(s1);
				pst.setFloat(1, rs.getInt(5));
				rs1=pst.executeQuery();
				if(rs1.next()) {
					if(fees>rs1.getFloat(1)) {
						System.out.println("Enter Valid Fees");
					}
					else {
						String ufees="update student set balance=? where sid=?";
						pst=conn.prepareStatement(ufees);
						pst.setFloat(1, fees);
						pst.setInt(2, sid);
						int result=pst.executeUpdate();
						if(result>0) {
							System.out.println("Student Fees Update.");
						}else {
							System.out.println("Student Fees Not Update");
						}
						break;
					}
				}
			}
				
				
			}else {
				System.out.println("Student ID Not Found.");
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			conn.close();
			pst.close();
			rs.close();
			
		}
		
		
	}
}

package com.programs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DatabaseOperations {
	// set connection requirement
	private static Connection conn;
	private static PreparedStatement pst;
	private static ResultSet rs;
	private static ResultSet rs1;
    static Scanner sc=new Scanner(System.in);
	
	 // Display All Student
	public static void displayAllStudent() throws SQLException {
		try {
			conn=DatabaseConnection.getConnection();
			String s="Select * from student";
			pst=conn.prepareStatement(s);
			rs=pst.executeQuery();
			System.out.println("*************************************************************************");
			System.out.println("SId\tSName\t     SEmail\t	  Smobile\tCid\tTotal_Fees");
			System.out.println("-------------------------------------------------------------------------");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getBigDecimal(4)+"\t"+rs.getInt(5)+"\t"+rs.getFloat(6));
	
			}
			System.out.println("*************************************************************************");
		}catch(Exception e) {
			e.printStackTrace();
		}
	   finally {
		conn.close();
		pst.close();
		rs.close();
	}
	
		
	}
	
	// get Status of student

	public static void getStatus() throws SQLException {
	   try {
			conn=DatabaseConnection.getConnection();
		    System.out.println("Enter Student ID");
		    int id=sc.nextInt();
		    
		    String s="select * from student where sid=?";
		    pst=conn.prepareStatement(s);
		    pst.setInt(1, id);
		    rs=pst.executeQuery();
		    if(rs.next()) {
		    	String sts="select * from course where cid=?";
		    	pst=conn.prepareStatement(sts);
		    	pst.setInt(1, rs.getInt(5));
		    	rs1=pst.executeQuery();
		    	if(rs1.next()) {
		    		System.out.println("------------------------------------------------");
		    		System.out.println("SID       : "+rs.getInt(1));
		    		System.out.println("SName     : "+rs.getString(2));
		    		System.out.println("SEmail    : "+rs.getString(3));
		    		System.out.println("SMobile   : "+rs.getBigDecimal(4));
                    System.out.println("CID       : "+rs1.getInt(1));
		    		System.out.println("CName     : "+rs1.getString(2));
		    		System.out.println("Cfees     : "+rs1.getFloat(3));
		    		System.out.println("Total Pay : "+rs.getFloat(6));
		    		
		    		// calculate student pending fees
		    		float cfees=rs1.getFloat(3);
		    		float sfees=rs.getFloat(6);
		    		float total=cfees-sfees;
		    		System.out.println("Fees Pending : "+total);
		    		System.out.println("------------------------------------------------");
		    		
		    	   
		    	}else {
		    		System.out.println("Record Not Found");
		    	}
		    	
		    	
		    }else {
		    	System.out.println("ID Not Found");
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
    
	// add new Student
	public static void addStudent() throws SQLException {
	 try {
		  conn=DatabaseConnection.getConnection();
		   // get max id from table
		   int sid=0;
		   String s="select max(sid) from student";
		   pst=conn.prepareStatement(s);
		   rs=pst.executeQuery();
		   if(rs.next()) {
			   sid=rs.getInt(1)+1;
		   }else {
			   System.out.println("Record Not fetch error occure");
		   }
		   System.out.println("Enter Name");
		   String name=sc.next();
		   System.out.println("Enter Email");
		   String email=sc.next();
		   System.out.println("Enter Mobile");
		   long mobile=sc.nextLong();
		   int cid;
		   while(true) {
			   System.out.println("Choose Course");
			   System.out.println("11. Java Full Stack (RS.5000)       22. C++ (RS.2000)");
			   System.out.println("33. Python          (RS.3000)       44. DS (RS.4000)");
			   cid =sc.nextInt();
			   if(cid==11 || cid==22 || cid==33 || cid==44) {
				   break;
			   }else {
				  System.out.println("Please Choose Valid Course.");
			   }
		   }
		   // check course fees
		   float amt=CheckValidation.validFees(cid);
		   
		   // check student already exists or not
		   int check=CheckValidation.checkStudent(mobile,email);
		   if(check==0) {
			   String ins="insert into student values(?,?,?,?,?,?)";
			   pst=conn.prepareStatement(ins);
			   pst.setInt(1, sid);
			   pst.setString(2, name);
			   pst.setString(3, email);
			   pst.setLong(4, mobile);
			   pst.setInt(5, cid);
			   pst.setFloat(6, amt);
			   
			   int result=pst.executeUpdate();
			   if(result>0) {
				   System.out.println("Student Add Successfully....");
			   }else {
				   System.out.println("Student Not Added");
			   }
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

	 // Delete Student
	public static void deleteStudent() throws SQLException {
		try {
			conn=DatabaseConnection.getConnection();
			System.out.println("Are You Sure To Delete Student Press y/n");
			char ch=sc.next().charAt(0);
			if(ch=='n') {
				
			}else {
				System.out.println("Enter Student ID");
				int sid=sc.nextInt();
				
				String s="select * from student where sid=?";
				pst=conn.prepareStatement(s);
				pst.setInt(1, sid);
				rs=pst.executeQuery();
				if(rs.next()) {
					String del="delete from student where sid=?";
					pst=conn.prepareStatement(del);
					pst.setInt(1, sid);
					int result=pst.executeUpdate();
					if(result>0) {
						System.out.println("Student Deleted.");
					}else {
						System.out.println("Student Not Delete.");
					}
				}else {
					System.out.println("Student ID Not Found.");
				}
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

	 // Update student
	public static void updateStudent() throws SQLException {
		while(true) {
			System.out.println("-----------------------------------------");
			System.out.println("1.Update Name         2.Update Email");
			System.out.println("3.Update Mobile       4.Update Course");
			System.out.println("5.Update Fees");
			System.out.println("-----------------------------------------");
			System.out.println("Enter You Choice");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				  System.out.println("Update Name");
				  UpdateStudent.updateName();
				  break;
			case 2:
				  System.out.println("Update Email");
				  UpdateStudent.updateEmail();
				  break;
			case 3:
				  System.out.println("Update Mobile");
				  UpdateStudent.updateMobile();
				  break;
			case 4:
				  System.out.println("Update Course");
				  UpdateStudent.updateCourse();
				  break;
			case 5:
				  System.out.println("Update Fees");
				  UpdateStudent.updateFees();
				  break;
		    default:
		    	  System.out.println("Please Enter Valid Choice");
			}
			System.out.println("Do You Want To Update More press y/n");
			char choice=sc.next().charAt(0);
			if(choice=='n') {
				break;
			}
		}
		
	}
}

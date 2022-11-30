package com.programs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DatabaseOpeartion {
	private static Connection conn=null;
	private static PreparedStatement pst=null;
	private static ResultSet rs=null;
	
	public static void displayRecord() {
		try {
			conn=DatabaseConnection.getConnection();
			String s="Select * from emp";
			pst=conn.prepareStatement(s);
			rs=pst.executeQuery();
			System.out.println("EId\tEname\tEemail\tEage\tEsalary\tDeptId");
			System.out.println("----------------------------------------------------");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\t"+rs.getFloat(5)+"\t"+rs.getInt(6));
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

}
	public static void insertRecord() {
		try {
			conn=DatabaseConnection.getConnection();
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter Eid");
			int eid=sc.nextInt();
			System.out.println("Enter Name ");
			String name=sc.next();
			System.out.println("Enter Email");
			String email=sc.next();
			System.out.println("Enter Age");
            int age=sc.nextInt();
            System.out.println("Enter Salary");
            float salary=sc.nextFloat();
            System.out.println("Enter Dept Id");
            int did=sc.nextInt();
            
            String s="select * from emp where eid=?";
            pst=conn.prepareStatement(s);
            pst.setInt(1, eid);
            rs=pst.executeQuery();
            if(rs.next()) {
            	System.out.println("Employee Id allrady Exists");
            }else {
            	String ins="insert into emp values(?,?,?,?,?,?)";
            	pst=conn.prepareStatement(ins);
                pst.setInt(1, eid);
                pst.setString(2, name);
                pst.setString(3, email);
                pst.setInt(4, age);
                pst.setFloat(5, salary);
                pst.setInt(6, did);
                
                int i=pst.executeUpdate();
                if(i>0) {
                	System.out.println("Record Insert");
                }
                else {
                	System.out.println("Error Occure...");
                }
                
                
            }
            
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	
		
	}
	public static void upadteRecord() {
		while(true) {
		try {
			conn=DatabaseConnection.getConnection();
			
			System.out.println("***************** Update Menu ****************");
			System.out.println("1. Update Name                 2.Update Email");
			System.out.println("3. Update Age                  4.Update Salary");
			System.out.println("5. Uodate DId                                 ");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Your Choice");
			int ch=sc.nextInt();
			
			switch(ch) {
			case 1:
				  System.out.println("Enter ID");
				  int id=sc.nextInt();
				  System.out.println("Enter Name");
				  String name=sc.next();
				  
				  String s="select * from emp where eid=?";
				  pst=conn.prepareStatement(s);
				  pst.setInt(1, id);
				  rs=pst.executeQuery();
				  if(rs.next()) {
					  
					   String uname="update emp set ename=? where eid=?";
					   pst=conn.prepareStatement(uname);
					   pst.setString(1, name);
					   pst.setInt(2, id);
					   
					   int  i=pst.executeUpdate();
					   if(i>0) {
						   System.out.println("Record Update");
					   }
					   else {
						   System.out.println("Error Occure");
					   }
				  }else {
					  System.out.println("Id Not Found");
				  }
				  
						  
				  break;
			case 2:
				System.out.println("Enter ID");
				  int id1=sc.nextInt();
				  System.out.println("Enter Email");
				  String email=sc.next();
				  
				  String s1="select * from emp where eid=?";
				  pst=conn.prepareStatement(s1);
				  pst.setInt(1, id1);
				  rs=pst.executeQuery();
				  if(rs.next()) {
					  
					   String uname="update emp set eemail=? where eid=?";
					   pst=conn.prepareStatement(uname);
					   pst.setString(1, email);
					   pst.setInt(2, id1);
					   
					   int  i=pst.executeUpdate();
					   if(i>0) {
						   System.out.println("Record Update");
					   }
					   else {
						   System.out.println("Error Occure");
					   }
				  }else {
					  System.out.println("Id Not Found");
				  }
				  break;
			case 3:
				System.out.println("Enter ID");
				  int id2=sc.nextInt();
				  System.out.println("Enter Age");
				  String age=sc.next();
				  
				  String s2="select * from emp where eid=?";
				  pst=conn.prepareStatement(s2);
				  pst.setInt(1, id2);
				  rs=pst.executeQuery();
				  if(rs.next()) {
					  
					   String uname="update emp set eage=? where eid=?";
					   pst=conn.prepareStatement(uname);
					   pst.setString(1, age);
					   pst.setInt(2, id2);
					   
					   int  i=pst.executeUpdate();
					   if(i>0) {
						   System.out.println("Record Update");
					   }
					   else {
						   System.out.println("Error Occure");
					   }
				  }else {
					  System.out.println("Id Not Found");
				  }
				  break;
			case 4:
				System.out.println("Enter ID");
				  int id3=sc.nextInt();
				  System.out.println("Enter Salary");
				  String sal=sc.next();
				  
				  String s3="select * from emp where eid=?";
				  pst=conn.prepareStatement(s3);
				  pst.setInt(1, id3);
				  rs=pst.executeQuery();
				  if(rs.next()) {
					  
					   String uname="update emp set esalary=? where eid=?";
					   pst=conn.prepareStatement(uname);
					   pst.setString(1, sal);
					   pst.setInt(2, id3);
					   
					   int  i=pst.executeUpdate();
					   if(i>0) {
						   System.out.println("Record Update");
					   }
					   else {
						   System.out.println("Error Occure");
					   }
				  }else {
					  System.out.println("Id Not Found");
				  }
				  break;
			case 5:
				System.out.println("Enter ID");
				  int id4=sc.nextInt();
				  System.out.println("Enter DID");
				  String did=sc.next();
				  
				  String s4="select * from emp where eid=?";
				  pst=conn.prepareStatement(s4);
				  pst.setInt(1, id4);
				  rs=pst.executeQuery();
				  if(rs.next()) {
					  
					   String uname="update emp set deptid=? where eid=?";
					   pst=conn.prepareStatement(uname);
					   pst.setString(1, did);
					   pst.setInt(2, id4);
					   
					   int  i=pst.executeUpdate();
					   if(i>0) {
						   System.out.println("Record Update");
					   }
					   else {
						   System.out.println("Error Occure");
					   }
				  }else {
					  System.out.println("Id Not Found");
				  }
				  break;
			default:
				  System.out.println("Enter Valid Choice");
			}
			System.out.println("Do You Want to update More press y/n");
			char choice=sc.next().charAt(0);
			if(choice=='n') {
				break;
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		}
		
		
	}
	public static void deleteRecord() {
		try {
			conn=DatabaseConnection.getConnection();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Employee Id");
			int eid=sc.nextInt();
			
			String s="select * from emp where eid=?";
			pst=conn.prepareStatement(s);
			pst.setInt(1,eid);
			rs=pst.executeQuery();
			if(rs.next()) {
				String del="delete from emp where eid=?";
				pst=conn.prepareStatement(del);
				pst.setInt(1, eid);
				int i=pst.executeUpdate();
				if(i>0) {
					System.out.println("Record Deleted");
				}
				else{
					System.out.println("Error Occure");
				}
				
				
			}else {
				System.out.println("Employee Id not Exists");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
  
}

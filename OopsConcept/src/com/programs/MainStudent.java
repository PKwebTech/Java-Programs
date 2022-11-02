package com.programs;

import java.util.Scanner;

class Student{
	int sid;
	String sname;
	float sfees;
	
	// get data
	
	void inputdata() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name :");
		sname=sc.next();
		System.out.println("Enter ID :");
		sid=sc.nextInt();
		System.out.println("Enter Fees :");
		sfees=sc.nextFloat();
	
		
		
	}
	// Display Data
	
			void display()
			{
				System.out.println("Name : "+sname);
				System.out.println("ID : "+sid);
				System.out.println("Fees : "+sfees);

			}
	
}
public class MainStudent {

	public static void main(String[] args) {
		Student obj1=new Student();
		Student obj2=new Student();
		
		obj1.inputdata();
		obj2.inputdata();
		
		obj1.display();
		obj2.display();
		
	}

}

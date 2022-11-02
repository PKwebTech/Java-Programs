package com.programs;

import java.util.Scanner;

class Employee{
	int eid;
	String ename;
	float esalary;
	String edept;
	static String cname;
	static {
		cname="Edubridge India PVT LTD";
	}
	
	// get data
	void inputData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name :");
		ename=sc.next();
		System.out.println("Enter Id :");
		eid=sc.nextInt();
		System.out.println("Enter Salary");
		esalary=sc.nextFloat();
		System.out.println("Enter Department :");
		edept=sc.next();
		
		
	}
	
	void display()
	{
		System.out.println("Employee Name : "+ename);
		System.out.println("Employee ID : "+eid);
		System.out.println("Employee Salary : "+esalary);
		System.out.println("Employee Department : "+edept);
		System.out.println("Employee Company : "+cname);
	}
}
public class OopsConcept1 {

	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		e1.inputData();
		e2.inputData();
		e3.inputData();
		
		e1.display();
		e2.display();
		e3.display();
	}

}

package com.progarms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Employee{
  private String name;
  private	int age;
  private	float sal;
	public void inputData() throws NumberFormatException, IOException {
		
//        InputStreamReader is=new InputStreamReader(System.in);
//        BufferedReader br=new BufferedReader(is);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Name :");
		name=br.readLine();
		System.out.println("Enter Age");
		age=Integer.parseInt(br.readLine());
		System.out.println("Enter Salary");
		sal=Float.parseFloat(br.readLine());
	}
	public void displayData() {

		System.out.println("Employee Details");
		System.out.println("Name   : "+name);
		System.out.println("Age    : "+age);
		System.out.println("Salary : "+sal);
	}
}
public class CheckedException {

	public static void main(String[] args) throws IOException {
		Employee ob=new Employee();
		ob.inputData();
		ob.displayData();
		
		
	}

}

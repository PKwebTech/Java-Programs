package Assigment;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	    String ename;
	    int eage;
	    String edept;
	    float esalary;
        double eyearsalary;
	    
	    // Get Data 
	
	   System.out.println("Enter Employee Name :");
	   ename=sc.nextLine();
	   System.out.println("Enter Employee Age :");
	   eage=sc.nextInt();
	   System.out.println("Enter Employee Department :");
	   edept=sc.next();
	   System.out.println("Enter Employee Salary :");
	   esalary=sc.nextFloat();


	   
	   eyearsalary=esalary*12;
	   
	   
	   
	   // Display Data
	   System.out.println("************ Employee Details **************");
	   System.out.println("Employee Name : "+ename);
	   System.out.println("Employee Age : "+eage);
	   System.out.println("Employee Department : "+edept);
	   System.out.println("Employee Salary : "+esalary);
	   System.out.println("Employee YearSalary : "+eyearsalary);
	    

	}

}

package com.programs;

import java.util.Scanner;

class Grade{
	int marks;
	
	void inputMarks() {
	   Scanner sc =new Scanner(System.in);
	   System.out.println("Enter Marks :");
	   marks=sc.nextInt();
	}
	
	void displayGrade()
	{
		if(marks>=90 && marks<=100) {
			System.out.println("Grade A");
		}
		else if(marks>=70 && marks<=89) {
			System.out.println("Grade B");
		}
		else if(marks>=40 && marks<=69) {
			System.out.println("Grade C");
		}
		else if(marks>=0 && marks<=39) {
			System.out.println("Grade D");
		}
	}
}
public class GradeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grade gob=new Grade();
		gob.inputMarks();
		gob.displayGrade();

	}

}

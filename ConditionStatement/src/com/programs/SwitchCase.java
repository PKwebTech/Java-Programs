package com.programs;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter day number");
		day=sc.nextInt(); //any value between 1 to 7
		
		switch(day) {
		case 1:System.out.println("Monday : first day of the week");
		      break;
		case 2:System.out.println("Tuesday: Second day of the week");
        		break;
		case 3:System.out.println("Wednesday: Third day of the week");
		       break;
		case 4:System.out.println("Thursday: Fourth day of the week");
        		break;
		case 5:System.out.println("Friday: Fifth day of the week");
				break;
		case 6:System.out.println("Saturday: Sixth day of the week");
				break;
		case 7: System.out.println("Sunday: seventh day of the week");
		        break;
		default:System.out.println("Invalid input");
		     
		        
		}


	}

}

package Assigment;

import java.util.Scanner;

public class Pattern8 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of Rows");
		int r=sc.nextInt();
		for(int i=1;i<=r;i++) {
			for(int k=1;k<=r-i;k++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i*2-1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}

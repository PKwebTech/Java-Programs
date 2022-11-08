package Assigment;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of Row");
		int r=sc.nextInt();
		int counter=1;
		for(int i=1;i<=r;i++) {
			for(int k=1;k<=r-i;k++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(counter+"  ");
				counter++;
			}
			System.out.println();
		}
	}

}

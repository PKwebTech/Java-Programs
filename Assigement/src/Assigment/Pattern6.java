package Assigment;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of rows");
		int r=sc.nextInt();
		for(int i=1;i<=r;i++) {
			for(int k=1;k<=r-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		for(int i=r-1;i>0;i--) {
			for(int k=r-1;k>=i;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}

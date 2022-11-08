package Assigment;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Of Rows");
		int r=sc.nextInt();
		for(int i=r;i>=1;i--) {
			for(int k=r;k>i;k--) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}

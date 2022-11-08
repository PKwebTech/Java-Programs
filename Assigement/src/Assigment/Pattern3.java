package Assigment;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		int count=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of Rows");
		int r=sc.nextInt();
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(count+ " ");
				count++;
			}
			System.out.println();
		}
	}

}

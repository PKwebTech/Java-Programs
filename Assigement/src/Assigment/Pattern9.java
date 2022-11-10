package Assigment;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of rows");
		int r=sc.nextInt();
		
		for(int i=1;i<=r;i++) {
			int no=i;
			for(int j=1;j<=i;j++) {
				System.out.print(no+" ");
				no=no+r-j;
			}
			System.out.println();
		}

	}

}

package com.programs;

public class Pattern6 {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) { // outer loop
			for(int k=3;k>=i;k-- ) {
				System.out.print("  ");
			}// loop for space 
		
		for(int j=1;j<=i;j++) {
			System.out.print(" *");
		}
		System.out.println();
		}
	}

}

package com.programs;

public class Pattern7 {

	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" *  ");
			}
			System.out.println();
			System.out.println();
			
		}
		
		for(int i=1;i<=4;i++) {
			for(int k=3;k>=i;k--) {
				System.out.print(" - ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}

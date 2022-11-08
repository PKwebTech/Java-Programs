package com.programs;

public class AdditionOfTwoMatrix {

	public static void main(String[] args) {
		// two matrix
		int a[][]= {{10,20,30},{40,50,60}};
		int b[][]= {{10,20,30},{40,50,60}};
		
		// to store addition of a and b matrix
		int c[][]=new int[2][3];
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
		    System.out.println();
		}
	}

}

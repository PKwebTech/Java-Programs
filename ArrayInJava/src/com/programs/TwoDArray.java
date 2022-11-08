package com.programs;

public class TwoDArray {

	public static void main(String[] args) {
		int r=3;
		int c=3;
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}

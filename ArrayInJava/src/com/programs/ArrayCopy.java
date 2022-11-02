package com.programs;

public class ArrayCopy {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		int arr1[]=arr.clone();
		System.out.println(arr[0]+ " " + arr[1]+" "+arr[2]+ " " + arr[3] );
		System.out.println(arr1[0]+ " " + arr1[1]+" "+arr1[2]+ " " + arr1[3] );

	}

}

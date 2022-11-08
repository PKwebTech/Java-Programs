package com.programs;

import java.util.Scanner;

public class OneDArray {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the size of an Array");
	 int size=sc.nextInt();
	 int arr[]=new int[size];
	 System.out.println("Enter the "+size+ " element");
	 for(int i=0;i<arr.length;i++) {
		 arr[i]=sc.nextInt();
	 }
	 
	 // print array
	 for(int i=0;i<arr.length;i++) {
		 System.out.print(arr[i] +" ");
	 }
	}

}

package com.programs;

import java.util.Arrays;

public class SecondLargestNo {

	public static void main(String[] args) {
		int arr[]= {99,80,20,50,10};
	   int first=0;
	   int second=0;
	   for(int i=0;i<arr.length;i++) {
		   if(arr[i]>first) {
			   second=first;
			   first=arr[i];
		   }else if(arr[i]>second && arr[i]!=first) {
			   second=arr[i];
		   }
	   }
	   System.out.println("First :"+first);
	   System.out.println("Second :"+second);

	}

}

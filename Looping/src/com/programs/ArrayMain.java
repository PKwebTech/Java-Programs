package com.programs;

import java.util.Scanner;

public class ArrayMain {

	public static void main(String[] args) {
		int arr[]=new int[5];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 Array Element");
		// input array
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		//display array
		System.out.println("Array Element");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
        
		// Sum OF Array
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("Sum : "+sum);
		
		// Avarage Of Array
		
		float avg=sum/arr.length;
		System.out.println("Avg : "+avg);
		
		// maximum array element
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Maximum Array element "+max);
		
		// minimum array element
				int min=arr[0];
				for(int i=1;i<arr.length;i++) {
					if(arr[i]<max) {
						max=arr[i];
					}
				}
				System.out.println("Maximum Array element "+max);
	}

}

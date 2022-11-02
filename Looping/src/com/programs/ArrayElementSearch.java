package com.programs;

import java.util.Scanner;

public class ArrayElementSearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Size Of an Array");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("Enter "+size+" Of an array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Element to search");
		int element=sc.nextInt();
		 int position=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) {
				position=i;
				break;
			}
		}
		if(position!=-1) {
			System.out.println(element +" Found in At Position : " +( position+1));
		}
		else {
			System.out.println(element + " Not found in array");
		}

	}

}

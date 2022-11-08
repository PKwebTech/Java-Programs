package com.progarms;

public class ArrayIndex {

	public static void main(String[] args) {
		int a[]=new int[4];
		System.out.println("Before array assign value");
		try {
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=40;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("After array assign value");

	}

}

package com.programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListMain1 {

	public static void main(String[] args) {
		ArrayList <String> lst=new ArrayList <String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter How many No you want store.");
		int num=sc.nextInt();
		String val;
		System.out.println("Enter Name");
	   for(int i=1;i<=num;i++)
	   {		
		 val=sc.nextLine();
		 lst.add(val);
	   }
//		for(String s:lst) {
//			System.out.print(s+" ");
//		}
		
	    Iterator<String> it=lst.iterator();
	    System.out.println();
	    while(it.hasNext()) {
	    	System.out.print(it.next()+" ");
	    }

	}

}

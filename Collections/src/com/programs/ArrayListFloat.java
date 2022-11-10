package com.programs;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;


public class ArrayListFloat {

	public static void main(String[] args) {
		Scanner  in=new Scanner(System.in);
		ArrayList<Float> list=new ArrayList<>();
		ArrayList<Float> l=new ArrayList<>();
		l.add(2f);
		l.add(2f);
		System.out.println("Enter Size");
		int n=in.nextInt();
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
		{
			list.add(in.nextFloat());
		}
		Iterator<Float>it=list.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println();
		System.out.println(list.contains(3f));
		System.out.println(list.containsAll(l));


	}

}

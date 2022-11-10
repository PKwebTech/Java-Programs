package com.programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class VectorMain {

	public static void main(String[] args) {
		Vector <Integer> lst=new Vector <Integer>();
		lst.add(50);
		lst.add(60);
		lst.add(70);
		
		//lst.clear();
		System.out.println(lst);
		System.out.println(lst.contains(90));
		
		ArrayList <Integer> lst1=new ArrayList <Integer>();
		lst1.add(10);
		lst1.add(20);
		lst1.add(30);
		
		System.out.println(lst1);
		
		lst.addAll(lst1);
		
		Iterator<Integer> it=lst.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		for(int a:lst) {
			System.out.print(a+" ");
		}
		
		lst.clear();
		System.out.println(lst);
		}
	
	
}

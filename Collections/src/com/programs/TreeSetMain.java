package com.programs;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetMain {

	public static void main(String[] args) {
		
		Set<Integer> ob=new TreeSet<Integer>();
		//1.no duplicate value
		//2.insertion order not maintain
		// 3.element sorted by assecnding order
		// 4.no null value 
		
		
		ob.add(10);
		ob.add(50);
		ob.add(5);
		ob.add(5);
		//ob.add(null);
		System.out.println(ob);
		

	}

}

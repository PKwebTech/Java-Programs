package com.programs;

import java.util.HashSet;
import java.util.Set;

public class HashSetMain {

	public static void main(String[] args) {
		Set<Integer> hob=new HashSet<Integer>();
		hob.add(89); //1. no duplicate values, 2. 
		              //2 .Insertion order not maintained 3.add null values
		
		hob.add(90);
		hob.add(65);
		hob.add(65);
		hob.add(89);
		hob.add(null);
		System.out.println(hob);
		

	}

}

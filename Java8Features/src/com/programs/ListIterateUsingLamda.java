package com.programs;

import java.util.ArrayList;
import java.util.Iterator;

public class ListIterateUsingLamda {

	public static void main(String[] args) {
		
		ArrayList<Integer> lst=new ArrayList<>();
		for(int i=1;i<=10;i++) {
			lst.add(i);
		}
		Iterator<Integer> it=lst.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// using lambda
		 lst.forEach(x->System.out.print(x+" "));
	}

}

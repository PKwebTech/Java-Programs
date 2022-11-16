package com.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Emmployee{
	int eid;
	String ename;
	int eage;
	public Emmployee(int eid, String ename, int eage) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eage = eage;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eage=" + eage + "]";
	}
	
	
}
//sorting user defined datatype
class SortAge implements Comparator<Emmployee>{

	@Override
	public int compare(Emmployee eob1, Emmployee eob2) {
		if (eob1.eage<eob2.eage)
			return -1;
		else if (eob1.eage>eob2.eage)
				return 1;
		else
			return 0;
		
	}
	
}
//sorting user defined datatype
class SortId implements Comparator<Emmployee>{

	@Override
	public int compare(Emmployee eob1, Emmployee eob2) {
		if (eob1.eid<eob2.eid)
			return -1;
		else if (eob1.eid>eob2.eid)
				return 1;
		else
			return 0;
		
	}
	
}
//name sorting
class SortName implements Comparator<Emmployee>{

	@Override
	public int compare(Emmployee eob1, Emmployee eob2) {
		return eob1.ename.compareTo(eob2.ename);
		
	}
	
}


public class EmployeeSort {
	public static void main(String[] args) {
		ArrayList<Emmployee>elst=new ArrayList<Emmployee>();
		
		Emmployee e1=new Emmployee(1, "Zeeba", 22);
		Emmployee e2=new Emmployee(2, "Poovi", 25);
		Emmployee e3=new Emmployee(6, "Gokul", 21);
		Emmployee e4=new Emmployee(5, "Praveen",20);
		
		elst.add(e1);
		elst.add(e2);
		elst.add(e3);
		elst.add(e4);
		
		System.out.println(elst);
		
		SortAge eage=new SortAge();
		Collections.sort(elst,eage);
		
		System.out.println("After sort");
		
		System.out.println(elst);
		
		
		SortId eidsort=new SortId();
		Collections.sort(elst,eidsort);
		
		System.out.println("After sort");
		
		System.out.println(elst);
		//Based on name sorting
				SortName nsort=new SortName();
				Collections.sort(elst,nsort);
				
				System.out.println("Sorting based on name");
				

				Iterator<Emmployee> it1=elst.iterator();
				
				while(it1.hasNext()) {
					Emmployee eobj=it1.next();
					
					System.out.println(eobj.eid+"\t"+eobj.ename+"\t"+eobj.eage);
				}

	}

}

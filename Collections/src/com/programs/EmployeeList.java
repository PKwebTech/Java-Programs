package com.programs;

import java.util.ArrayList;
import java.util.Iterator;

class Employee{
	  int eid;
	  String ename;
	  float esal;
	public Employee(int eid, String ename, float esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}
}
public class EmployeeList {

	public static void main(String[] args) {
		ArrayList<Employee> emp=new ArrayList<>();
		Employee e1=new Employee(1,"Pravin",200040.0f);
		Employee e2=new Employee(2,"Pradip",400040.0f);
		emp.add(e1);
		emp.add(e2);
		System.out.println("******************************** Employee List ******************************");
		System.out.println("EID\t ENAME\t ESALRY");
	   
		Iterator<Employee> em=emp.iterator();
		
		while(em.hasNext()) {
			Employee eob=em.next();
			System.out.println(eob.eid+"\t"+eob.ename+"\t"+eob.esal);
		}

	}

}

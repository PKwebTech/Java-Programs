package com.programs;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
	int sid;
	String sname;
	float sfees;
	public Student(int id, String name, float fees) {
		super();
		this.sid = id;
		this.sname = name;
		this.sfees = fees;
	}
	@Override
	public String toString() {
		return "Student [id=" + sid + ", name=" + sname + ", fees=" + sfees + "]";
	}
	
}
public class StudentList {

	public static void main(String[] args) {
		ArrayList<Student> slist=new ArrayList<Student>();
		Student s1=new Student(1,"Pravin",4000.40f);
		Student s2=new Student(2,"Mahed",5000.40f);
		Student s3=new Student(3,"Madan",6000.40f);
		
		slist.add(s1);
		slist.add(s2);
		slist.add(s3);
		System.out.println(slist);
		
	   Iterator<Student> st= slist.iterator();
	   System.out.print("SID\tSNAME\tSFEES");
	   while(st.hasNext()) {
			Student sob=st.next();
			System.out.println(sob.sid+"\t"+sob.sname+"\t"+sob.sfees );
			}



	}

}

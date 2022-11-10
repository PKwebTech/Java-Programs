package com.programs;

class Student{
	private int sid;
	private String sname;
	public Student() {
		System.out.println("Constructore make access specifire  public because");
		System.out.println("We need to create Object");
	}
	public void display() {
		System.out.println("sid : "+sid);
		System.out.println("sname : "+sname);
	}
}
public class AccessDpecifiersMain {

	public static void main(String[] args) {
		Student ob=new Student();
	//	System.out.println(ob.sid);// error because private 
		ob.display();

	}

}

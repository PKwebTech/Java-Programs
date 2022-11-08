package com.programs;
class ParentClass{
	  int i,j;
	  ParentClass(int i,int j){
		   this.i=i;    // this  keyword is used to refer the current class instance variable.
		   this.j=j;
	  }
}

// HAS-A relation
class Child extends ParentClass{  // single Inheritance
	Child(int i,int j){
		super(i,j);     // to call parent class constructor we used super() method;
		System.out.println("Child Counstructor");
	}
	int sum;
	void add() {
		sum=i+j;
		System.out.println("Sum : "+sum);
	}
}
public class MainClass {
   public static void main(String[] args) {
	   Child ob=new Child(10,10);
	   ob.add();
}
}

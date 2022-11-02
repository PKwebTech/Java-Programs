package com.programs;

public class TypesOfVariable {
	int b;  // instance variable
	static int c=10;  // static varibal
	

	public static void main(String[] args) {
		int a=10;  // local variable
		TypesOfVariable obj=new TypesOfVariable();
		System.out.println("Local Vaibale a = "+a);
		System.out.println("Instance Varibale b = "+obj.b);
	    System.out.println("Static varibale c = "+c);
	    System.out.println("Static varibale c = "+obj.c);  // call using obj
	    System.out.println("Static varibale c = "+TypesOfVariable.c); // call using classname
		
	}

}

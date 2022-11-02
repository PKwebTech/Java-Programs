package com.programs;

public class StringComparesion {

	public static void main(String[] args) {
		String s="Hello";
		String s1="Hello";
		String s2=new String("Hello");
		boolean b=(s==s1);
		System.out.println("b="+b);
		
		boolean b1=(s1==s2);
		System.out.println("b1="+b1);
		
		System.out.println("s and s1 values are same "+s.equals(s1));
		System.out.println("s1 and s2 values are same "+s1.equals(s2));


	}

}

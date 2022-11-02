package com.programs;

public class NonPremitiveString {

	public static void main(String[] args) {
		String fname="Pravin";
		String lname="Kolate";
		
		// No of Characters length()
		
		int l=fname.length();
		System.out.println("No Of Characters : "+l);
		
		// charAt()
		System.out.println("1st Character : "+fname.charAt(0));
		System.out.println("last Character : "+fname.charAt(5));
		
		// Concat
		String fullname=fname+" " +lname;
		String fn=fname.concat(lname);
		System.out.println("FullName : "+fullname);
		System.out.println("FullName : "+fn);
		
		// lowercase
		System.out.println("toLowercase :"+fname.toLowerCase());
		
		//uppercase
		System.out.println("toUpperCase : "+fname.toUpperCase());
		
		//substring
		System.out.println("substring from (2,4)"+fname.substring(2,4));
		System.out.println("substring from (2)"+fname.substring(2));

	}

}

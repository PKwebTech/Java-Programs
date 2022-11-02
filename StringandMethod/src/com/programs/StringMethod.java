package com.programs;

public class StringMethod {

	public static void main(String[] args) {
		String name="Hello World !";
		//charAt()
		
		char ch=name.charAt(4);
		System.out.println("Charater at 4 posotion: "+ch);
		
		// Contains()
		System.out.println(name.contains("Hello"));
		System.out.println(name.contains("ello"));
		
		//indexOf()
		System.out.println("index OF O :"+name.indexOf('o'));
		
		//lastindexOf
		System.out.println("last index "+name.lastIndexOf('o'));
		
		//replace

		System.out.println("Reaplace String : "+name.replace('H', 'h'));
		System.out.println("Reaplace String : "+name.replace("World","How Are You !"));
		
		//reverse
		StringBuffer sb=new StringBuffer(name);
		StringBuilder sb1=new StringBuilder(name);
		System.out.println(sb.reverse());
		System.out.println(sb1.append("Hello"));
	
	}

}

package com.progarms;

public class Exception3 {

	public static void main(String[] args) {
		int a=10,b=0,c=0;
		int arr[]=new int[4];
		System.out.println("Before Division");
		System.out.println("After Array Assigement");
		try {
		c=a/b;
		arr[4]=50;
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
        catch(ArrayIndexOutOfBoundsException e) {
        	e.printStackTrace();
        }
		finally{
			System.out.println("Finally Block will execute always");
			// we use finally block for closing resources.
		}
		System.out.println("After Division");
		System.out.println("After Array Assigememt");
		
		
	}

}

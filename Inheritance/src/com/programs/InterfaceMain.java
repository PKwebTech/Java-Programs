// interface is a blueprint of class
// it has only defination of method 
// using subclass we can implement the tese method
// one subclass can implement multiple interface using this multiple interitance call.

package com.programs;
interface MyInterface1{
	     void m1();
	     void m2(); // public abstract
}

class Product implements MyInterface1{

	@Override
	public void m1() {
		System.out.println("This is m1() method");
	}

	@Override
	public void m2() {
		System.out.println("This is m2() method");
		
	}
	
}
public class InterfaceMain {

	public static void main(String[] args) {
		Product p1=new Product();
		p1.m1();
		p1.m2();

	}

}

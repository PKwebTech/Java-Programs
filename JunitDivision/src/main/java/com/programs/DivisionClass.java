package com.programs;

public class DivisionClass {
   int n1,n2;
   public DivisionClass(int n1,int n2) {
	    this.n1=n1;
	    this.n2=n2;
   }
   
   public int divisionnum() throws ArithmeticException {
	   return n1/n2;
   }
}

package com.programs;

abstract class Bank{
	 abstract void rateOfInterest();
	 void display() {
		 System.out.println("This is no abstarct method");
	 }
	 

 }

class SBIBank extends Bank{
	void rateOfInterest(){
        System.out.println("SBI rate of interest 8%");
  }

}
class IDBC extends Bank//rateof interest 9
{
     void rateOfInterest(){
           System.out.println("IDBC rate of interest 9%");
     }
}

public class AbstractClass {

	public static void main(String[] args) {
		SBIBank ob=new SBIBank();
		ob.display();
		ob.rateOfInterest();
		IDBC ob1=new IDBC();
		ob1.display();
		ob1.rateOfInterest();
		
		// for Abstract class object creation is not possible  

	}

}

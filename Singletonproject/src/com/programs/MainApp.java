// singleton pattern : By making constructor private
package com.programs;

class Product{
	int pid;
	String pname;
	public static Product pob;
	private Product() {
		pid=0;
		pname=null;
	}
	public static Product getProductObject() {
		  if(pob==null) {
			  pob=new Product();
			  System.out.println("Object Created "+pob);
		  }else {
			  return pob;
		  }
		  return pob;
	}
	void display() {
		System.out.println("Display Method");
	}
}
public class MainApp {

	public static void main(String[] args) {
		Product p1=Product.getProductObject();
		System.out.println("Object Created inside main "+p1);
		p1.display();
		
	}

}

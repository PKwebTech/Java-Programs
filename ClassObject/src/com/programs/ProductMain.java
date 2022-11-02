package com.programs;

class Product{
	int pid;
	String pname;
	float pprice;
	
	Product(){
		pid=1;
		pname="TV";
		pprice=30000.2f;
	}
	Product(int i,String s,float f){
		pid=i;
		pname=s;
		pprice=f;
	}
	void display() {
		System.out.println("Product ID : "+pid);
		System.out.println("Product Name : "+pname);
		System.out.println("Product Price : "+pprice);
	}
}
public class ProductMain {

	public static void main(String[] args) {
		Product ob=new  Product();  // default constructor
		System.out.println("Product ID : "+ob.pid);
		System.out.println("Product Name : "+ob.pname);
		System.out.println("Product Price : "+ob.pprice);
		Product ob1=new  Product(2,"Laptop",60000.20f); // Parameterize constructor
		ob.display();
		ob1.display();

	}

}

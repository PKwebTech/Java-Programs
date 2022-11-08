package com.programs;
abstract class Shape{
	 abstract void area();
}

class Reactangle extends Shape{

	@Override
	void area() {
		int l=10;
		int b=40;
		int a=l*b;
		System.out.println("Area of Reactangle : "+a);
		
	}
	
}

class Square extends Shape{

	@Override
	void area() {
		int l=10;
		int a=l*l;
		System.out.println("Area of Square : "+l);
		
	}
	
}
public class MainShape {

	public static void main(String[] args) {
		Reactangle rob=new Reactangle();
		rob.area();
		Square sob=new Square();
		sob.area();
		
		// another way to create abstract class object;
		Shape obj;
		obj=new Reactangle();
		obj.area();//reactangle
		obj=new Square();
		obj.area();//square


	}

}

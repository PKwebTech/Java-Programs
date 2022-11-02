package com.programs;

class Area{
	void area(int l) { // area of sequre
		int a;
		a=l*l;
		System.out.println("Area Of sequre of length = "+l+" is "+a);
	}
	void area(int l,int h) { //area of reactangle
		int a;
		a=l*h;
		System.out.println("Area Of Reactangle of length = "+l+" and heigth = "+h+" is "+a);
	}
	void area(float r) { //area of circle
		float a;
		a=3.1498f*r*r;
		System.out.println("Area Of circle of radius = "+r+" is "+a);
	}
	void area(float base,float height) { //area of triangle
		float a;
		a=0.5f*base*height;
		System.out.println("Area Of Triangle of base = "+base+" and height = "+height +" is "+a);
	}
}
public class AreaMain {

	public static void main(String[] args) {
		Area obj=new Area();
		obj.area(10);
		obj.area(20, 30);
		obj.area(5.5f);
		obj.area(10.30f, 50.0f);
	}

}

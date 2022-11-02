package Assigment;

import java.util.Scanner;

class Area{
	float area;
	Scanner sc=new Scanner(System.in);
	
	void areaOfReatangle() {
		float length,height;
		System.out.println("Enter The Length");
		length=sc.nextFloat();
		System.out.println("Enter The Height");
		height=sc.nextFloat();
		area=length*height;
		System.out.println("Area Of Reactangle of length : "+length+ " and height : "+height+ " = "+area);
	}
	
	void areaOfSequre() {
		float height;
		System.out.println("Enter The Height");
		height=sc.nextFloat();
		area=height*height;
		System.out.println("Area Of Reactangle of  height : "+height+ " = "+area);
	}
	
	void areaOfCircle() {
		float radius;
		System.out.println("Enter The Radius");
		radius=sc.nextFloat();
		area=3.14f*radius*radius;
		System.out.println("Area Of Reactangle of  radius : "+radius+ " = "+area);
	}
	
	void areaOfTriangle() {
		float base,height;
		System.out.println("Enter The Base");
		base=sc.nextFloat();
		System.out.println("Enter The Height");
		height=sc.nextFloat();
		area=(base*height)/2;
		System.out.println("Area Of Triangle of base : "+base+ " and height : "+height+ " = "+area);
	}
}
public class AreaMain {

	public static void main(String[] args) {
		Area obj=new Area();
		Scanner sc=new Scanner(System.in);
		System.out.println("************ Area Of Shape ***************");
		while(true) {
			System.out.println("1. Area Of Reactangle");
			System.out.println("2. Area Of Sequre");
			System.out.println("3. Area Of Circle");
			System.out.println("4. Area Of Triangle");
			System.out.println("5. Exit");
			
			System.out.println("Enter Your Choice");
			int ch=sc.nextInt();
			
			switch(ch) {
			case 1:
				   obj.areaOfReatangle();
				   break;
			case 2:
				   obj.areaOfSequre();;
				   break;
			case 3:
				   obj.areaOfCircle();
				   break;
			case 4:
				   obj.areaOfTriangle();
				   break;
			case 5:
				   System.exit(0);
				   
			}
		}

	}

}

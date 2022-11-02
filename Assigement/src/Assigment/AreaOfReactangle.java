package Assigment;

import java.util.Scanner;

public class AreaOfReactangle {

	public static void main(String[] args) {
		float length,height,area;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Length : ");
		length=sc.nextFloat();
		System.out.println("Enter Height : ");
		height=sc.nextFloat();
		
		area=length*height;
		
		System.out.println("Area Of Reactangle Of Lenght :"+length+ " and Hieght :"+height+ " = "+area);
	}

}

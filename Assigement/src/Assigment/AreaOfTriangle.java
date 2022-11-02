package Assigment;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		float base,heigth,area;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Base Of Triangle ");
		base=sc.nextFloat();
		System.out.println("Enter Height of Triangle");
		heigth=sc.nextFloat();
		
		area=(base*heigth)/2;
		
		System.out.println("Area Of Triangle Of Base: "+base+ " and Hiegth: "+heigth+" = "+area);
		

	}

}

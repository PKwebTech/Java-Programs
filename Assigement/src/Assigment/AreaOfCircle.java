package Assigment;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		float radius,area;
		Scanner sc=new Scanner(System.in);
		
        System.out.println("Enter Radius Of Circle :");
        radius=sc.nextFloat();
        
        area=3.14f*radius*radius;
        
        System.out.println("Area Of Circle Of Radius:" +radius+" = "+area);
        
	}

}

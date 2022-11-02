package Assigment;

import java.util.Scanner;

public class AreaOfSequre {

	public static void main(String[] args) {
      float heigth,area;
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter Heigth :");
      heigth=sc.nextFloat();
      
      area=heigth*heigth;
      System.out.println("Area Of Sequre of Hieght: "+heigth+" =" +area);
	}

}

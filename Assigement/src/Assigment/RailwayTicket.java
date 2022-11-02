package Assigment;

import java.util.Scanner;

class Railway{
	String name,coach;
	long mobno;
	int amt;
	int totalamt;
	
	void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name ");
		name=sc.nextLine();
		System.out.println("Enter Type Of Coach");
		coach=sc.next();
		System.out.println("Enter Mobile Number");
		mobno=sc.nextLong();
		System.out.println("Enter Amont");
		amt=sc.nextInt();
	}
	
	void update() {
		if(coach.equals("First_AC")) {
			totalamt=700+amt;
			System.out.println("First");
		}
		else if(coach.equals("Second_AC")) {
			totalamt=500+amt;
			System.out.println("s");
		}
		else if(coach.equals("Third_AC")) {
			totalamt=250+amt;
			System.out.println("t");
		}
		else {
			totalamt=amt;
			System.out.println("no");
		}
	}
	
	void display() {
		System.out.println("******************** Customer Bill ******************");
		System.out.println("Customer Name : "+name);
		System.out.println("Type Of Coach : "+coach);
		System.out.println("Customer MobNo : "+mobno);
		System.out.println("Total Amount : "+totalamt);

	}
	
}
public class RailwayTicket {

	public static void main(String[] args) {
		Railway rob=new Railway();
		rob.accept();
		rob.update();
		rob.display();

	}

}

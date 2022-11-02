package Assigment;

import java.util.Scanner;

class ShowRoom{
	String name;
	long mobno;
	double cost,dis,amount;
	
	void showRoom()
	{
		name="";
		mobno=0;
		cost=0;
		dis=0;
		amount=0;
	}
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer Name :");
		name=sc.nextLine();
		System.out.println("Enter Customer Mobile :");
		mobno=sc.nextLong();
		System.out.println("Enter The Toatl Cost :");
		cost=sc.nextDouble();
	}
	void calculate()
	{
		if(cost<=10000)
		{
			dis=(cost*5)/100;
			amount=cost-dis;
		}
		else if(cost>=10000 && cost<=20000)
		{
			dis=(cost*10)/100;
			amount=cost-dis;
		}
		else if(cost>=20000 && cost<=35000)
		{
			dis=(cost*15)/100;
			amount=cost-dis;
		}
		else if(cost>=35000)
		{
			dis=(cost*20)/100;
			amount=cost-dis;
		}
	}
	void display()
	{
		 System.out.println("********************* Bill *********************");
		 System.out.println("Customer Name : "+name);
		 System.out.println("Customer MobNo : "+mobno);
		 System.out.println("Congratulation You Have Save "+dis+" RS");
		 System.out.println("Total Amount  "+amount+" RS");
	}
}

public class ShowRoomMain {

	public static void main(String[] args) {
		ShowRoom obj=new ShowRoom();
		obj.input();
		obj.calculate();
		obj.display();

	}

}

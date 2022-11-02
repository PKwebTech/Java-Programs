package Assigment;

import java.util.Scanner;

class EBill{
	String name;
	int consumnerno;
	float unit,billtopay=0,preading,prevreading,unitconsumed;
	Scanner sc=new Scanner(System.in);
	
	void inputData() {
		System.out.println("Enter Customer Name :");
		name=sc.next();
		System.out.println("Enter Consumer Number");
		consumnerno=sc.nextInt();
		System.out.println("Enter The Total Units");
		unit=sc.nextFloat();
		System.out.println("Enter The Presentreading");
		preading=sc.nextFloat();
		System.out.println("Enter The Prevreading");
		prevreading=sc.nextFloat();
	}
	void claculateBill() {
		if(unit<=100) {
			billtopay=unit*1.25f;
		}
		else if(unit>=100 && unit<=200) {
			billtopay=100*1.25f+(unit-100)*1.50f;
			
		}
		else if(unit>=200) {
			billtopay=100*1.25f+100*1.50f+(unit-200)*1.80f;
		}
		unitconsumed=preading-prevreading;
	}
	void displayBill() {
		System.out.println("Consumner Number  Customer Name Unit Consumed  Amount");
		System.out.println(consumnerno +" "+ name +" "+unitconsumed+" "+billtopay );
	}
}
	
public class ElectricityBill {

	public static void main(String[] args) {
		EBill obj=new EBill();
		obj.inputData();
		obj.claculateBill();
		obj.displayBill();
	}

}



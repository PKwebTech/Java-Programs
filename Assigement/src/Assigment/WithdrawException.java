package Assigment;

import java.util.Scanner;

class Bank extends Exception{
	public Bank(String s) {
		super(s);
	}
}
class Balance{
	int bal=10000, wamt;
	void withdraw() {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Amount to withdraw");
			wamt=sc.nextInt();
			if(wamt>bal) {
				throw new Bank("Insufficient Balance In Your Account......");
			}else {
				bal=bal-wamt;
				System.out.println(wamt+".RS Withdraw Sucessfully.....");
				System.out.println("Avaible Balance : "+bal +".RS");
				
			}
			
		}
		catch(Bank e) {
			e.printStackTrace();
		}
	}
}
public class WithdrawException {
    public static void main(String[] args) {
    	Balance bob=new Balance();
    	bob.withdraw();
	}
}

package com.programs;
class Customer{    
	int amount=10000;    
    
	synchronized void withdraw(int wamount){    
		System.out.println("going to withdraw...");    
    
		if(this.amount<wamount){    
				System.out.println("Less balance; waiting for deposit...");    
				try{
					System.out.println("before Waiting");
					wait();
					System.out.println("after Waiting");
					}catch(Exception e){
						e.printStackTrace();
					}    
			}    
			this.amount-=amount;    
			System.out.println("withdraw completed...");    
}    
    
synchronized void deposit(int amount){    
		System.out.println("going to deposit...");    
			this.amount+=amount;    
			System.out.println("deposit completed... ");    
			notify();    
	}    
}

public class Test{    
	public static void main(String args[]){    
		final Customer c=new Customer();    
			
		    new Thread(){    
				public void run()
				{
					c.withdraw(15000);
				}    
			}.start();    
			
			new Thread(){    
				public void run()
				{
					c.deposit(10000);
				}    
			}.start();    
    
}//main
	
}  //Test


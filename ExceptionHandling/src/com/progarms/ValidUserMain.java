package com.progarms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ValidUser{
	private String username;
	private String password;
	
	public void inputData() throws NullPointerException, IOException ,NumberFormatException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter UserName");
		username=br.readLine();
		System.out.println("Enter Password");
		password=br.readLine();
	}
	
	public void validate() {
		int count=1;
		int attemp=3;
		while(count<3) {
		try {
			if(username.equals("admin") && password.equals("admin123")) {
				System.out.println("Login Successfully...........");
				break;
			}else {
                attemp-=1;
				System.out.println("Username and Password Incorrect....");
				System.out.println("Try Again You have only "+attemp+ " attemp");
				inputData();
				count++;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	
		if(count==3) {
			System.out.println("Username and Password Incorrect....");
			System.out.println("You Have No attempt try again after 24 hour...");
		}
	}
}
}
public class ValidUserMain {

	public static void main(String[] args) throws NumberFormatException, NullPointerException, IOException {
		ValidUser ob=new ValidUser();
		ob.inputData();
		ob.validate();

	}

}

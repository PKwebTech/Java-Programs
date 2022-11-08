package com.progarms;

public class Excep4 {

	public static void main(String[] args) {
		int a=10,b=0,c=0;
		System.out.println("Before division");
		try {
			if(b==0) throw new ArithmeticException("Divide by zero error");
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}

	}

}

package com.programs;

public class PrimeNumber1to100 {

	public static void main(String[] args) {
		int count=0;
		for(int num=1;num<=100;num++) {
			count=0;
			for(int j=1;j<=num;j++) {
				if(num%j==0) {
					count+=1;
				}
			}
			if(count==2) {
				System.out.print(num +" ");
			}
		}

	}

}

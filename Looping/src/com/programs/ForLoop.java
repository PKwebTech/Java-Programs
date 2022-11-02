package com.programs;

public class ForLoop {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
//			if(i==5) {
//				break;
//			}
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}
	}

}

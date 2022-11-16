package com.programs;

class Table1{
	synchronized void methodPrint(int num) {
		for(int i=1;i<=10;i++) {
			System.out.println(num+"x"+i+"="+num*i); //2x1=2.......2x10=20
		}
	}
}

public class MainTablePrint1 {

	public static void main(String[] args) {
		Table1 t=new Table1();
		//Annonymous class
		Thread tob=new Thread() {
			
			public void run() {
				t.methodPrint(4);
			}
			
		};
		tob.start();
       Thread tob1= new Thread() {
			
			public void run() {
				t.methodPrint(8);
			}
			
		};
		tob1.start();
		

	}

}

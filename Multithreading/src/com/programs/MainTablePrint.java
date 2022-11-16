package com.programs;

class Table{
	synchronized void methodPrint(int num) {   // synchronized is keyword that block the thread when particular thread run
		for(int i=1;i<=10;i++) {
			System.out.println(num+"x"+i+"="+num*i); //2x1=2.......2x10=20
		}
	}
}

class MyThread1 extends Thread{
	Table tob1;
	MyThread1(Table t){
		tob1=t;
		
	}
	public void run() {
		tob1.methodPrint(2);
	}
}

class MyThread2 extends Thread{
	Table tob2;
	MyThread2(Table t){
		tob2=t;
	}
	public void run() {
		tob2.methodPrint(5);
	}
}
public class MainTablePrint {

	public static void main(String[] args) throws InterruptedException {
		Table t=new Table();
		MyThread1 t1=new MyThread1(t);
		t1.setName("two");
		t1.start();
		
		MyThread2 t2=new MyThread2(t);
		t2.setName("five");
		t2.start();
		
	
	}

}

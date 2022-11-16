package com.programs;

class MyThread extends Thread{
	public void run(){
		for(int i=1;i<=5;i++) {
		System.out.println("MyThread "+Thread.currentThread());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
public class MyThreadMain {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Thread "+Thread.currentThread());
		MyThread ob=new MyThread();
		System.out.println("First thread is live "+ob.isAlive());
		ob.setName("FirstThread");
		ob.start();
		System.out.println("First thread is live "+ob.isAlive());
		ob.join();
		MyThread ob1=new MyThread();
		System.out.println("second thread is live "+ob1.isAlive());
		ob1.setName("SecondThread");
		ob1.start();
		System.out.println("second thread is live "+ob1.isAlive());
	}

}

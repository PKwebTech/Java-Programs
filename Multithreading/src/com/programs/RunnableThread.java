package com.programs;

class MyClass implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	 
}
public class RunnableThread {

	public static void main(String[] args) throws InterruptedException {
		MyClass ob=new MyClass();
		MyClass ob1=new MyClass();
		Thread th=new Thread(ob);
		Thread th1=new Thread(ob);
		th.setName("FirstThread");
		th1.setName("SecondThread");
		th.start();
		th.join();
		th1.start();
		

	}

}

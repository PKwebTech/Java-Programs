package com.programs;

class ThreadClass extends Thread{
	public void run() {
		System.out.println("Run Method Called : "+ Thread.currentThread());
	}
	 
}
public class ChangePriority {
      // 1-10 10 max 1 min 5 normal
	public static void main(String[] args) {
		ThreadClass tob=new ThreadClass();
		tob.setPriority(10);
		tob.setPriority(Thread.MAX_PRIORITY);
		System.out.println("Thread Priority : "+tob.getPriority());
		
		tob.start();
		ThreadClass tob1=new ThreadClass();
		tob1.setPriority(3);
//		tob1.setPriority(Thread.MIN_PRIORITY);
		System.out.println("Thread Priority : "+tob.getPriority());
		tob1.start();

	}

}

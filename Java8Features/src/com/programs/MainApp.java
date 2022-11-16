package com.programs;

@FunctionalInterface
interface Addition{
	  public void add(int a,int b);
	  default void method1() {
		  System.out.println("Deafult Method");
	  }
	  default void method3() {
		  System.out.println("Deafult Method");
	  }
	  static void method2() {
		  System.out.println("Static Method");
	  }
}

@FunctionalInterface
interface Multiplication{
	 int prod(int a,int b);
}

@FunctionalInterface
interface SayHello{
	
	String  disp(String s);
}
@FunctionalInterface
interface Substration{
	 int sub(int a,int b);
}
public class MainApp {

	public static void main(String[] args) {
		
		Addition aob=(a,b)->{
			 int c;
			 c=a+b;
			 System.out.println("Sum ="+c);
		};
		aob.add(10, 5);
		aob.method1();
		aob.method3();
		Addition.method2();
		
//		Multiplication mob=(int a,int b)->{
//			 int c;
//			 c=a*b;
//			 System.out.println("Product ="+c);
//		};
		
		Multiplication mob=(a,b)->(a*b);
		System.out.println(mob.prod(10, 3));
		
		Substration sob=(a,b)->(a-b);
		System.out.println("Substration ="+sob.sub(10, 5));
		
		
		
		Runnable rob=()->{
			System.out.println("Run method is called");
		};
	    Thread tob=new Thread(rob);
	    tob.start();
	    
	    SayHello sob1=(s)->(s);
	    System.out.println("Hello "+sob1.disp("Pravin"));

	}

}

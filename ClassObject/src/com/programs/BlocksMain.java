// Different Blocks in Java.
package com.programs;

public class BlocksMain {
	static {
		System.out.println("Static Block  will excute before main method");
	}
	{
		System.out.println("Annonymous Block will execute before constructor");
	}
	BlocksMain(){
		System.out.println("Constructor will be execute on object creation");
	}
	void display() {
		System.out.println("Display Method");
	}

	public static void main(String[] args) {
		 System.out.println("Main Method");
		 BlocksMain ob=new BlocksMain();
		 ob.display();
	}

}

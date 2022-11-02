package com.programs;
  class Addition{
	 void  add(int i,int j) {
		 int sum;
		 sum=i+j;
		 System.out.println("Sum Of 2 int No "+ i+ " and "+ j+ " = "+sum);
	 }
	 void  add(short i,short j) {
		 short sum;
		 sum=(short) (i+j);
		 System.out.println("Sum Of 2 short No "+ i+ " and "+ j+ " = "+sum);
	 }
	 void  add(byte i,byte j) {
		 byte sum;
		 sum=(byte) (i+j);
		 System.out.println("Sum Of 2 byte No "+ i+ " and "+ j+ " = "+sum);
	 }
	 void  add(long i,long j) {
		 long sum;
		 sum=(long) (i+j);
		 System.out.println("Sum Of 2 long No "+ i+ " and "+ j+ " = "+sum);
	 }
	 
	 void add(float a,float b) {
		 float sum=a+b;
		 System.out.println("Sum Of 2 float No "+ a+ " and "+ b+ " = "+sum);
		 
	 }
	 void add(double a,double b) {
		 double sum=a+b;
		 System.out.println("Sum Of 2 double No "+ a+ " and "+ b+ " = "+sum);
		 
	 }
  }
public class AdditionMain {
  
	public static void main(String[] args) {
		Addition obj=new Addition();
		obj.add(10, 10);
		obj.add(20.4f, 10.5f);
		obj.add(100.20, 100.20);
		obj.add((short)1, (short)4);
		obj.add((byte)2, (byte)2);
		obj.add(1000l, 2000l);

	}

}

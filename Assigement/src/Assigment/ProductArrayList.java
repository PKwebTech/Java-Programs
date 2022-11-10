package Assigment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Product{
	private int pid;
	private String pname;
	private float pprice;
	
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + "]";
	}
	ArrayList<Product> lst=new ArrayList<Product>();
	public void inputData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Product ID");
		pid=sc.nextInt();
		System.out.println("Enter Product Name");
		pname=sc.next();
		System.out.println("Enter Product Price");
		pprice=sc.nextFloat();
		
		lst.add(this);  // add current object that contain(current data member value  pid,pname,ppprice)
	
	}
	public void displayData() {
		Iterator<Product> it=lst.iterator();
		while(it.hasNext()) {
			Product pob=it.next();
			System.out.print(pob.pid+"    \t"+pob.pname+"    \t"+pob.pprice);
		}
		System.out.println();
	}
}
public class ProductArrayList {

	public static void main(String[] args) {
		Product p=new Product();
		Product p1=new Product();
		Product p2=new Product();
		p.inputData();
		p1.inputData();
		p2.inputData();
		System.out.println("********************** Product Details**********************");
		System.out.println();
		System.out.println("PID    \tPNAME     \t PPRICE");
		System.out.println("----------------------------------------");
		p.displayData();
		p1.displayData();
		p2.displayData();

	}

}

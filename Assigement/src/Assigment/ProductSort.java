package Assigment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class ProductList{
	   int id;
	   String name;
	   float price;
	   
	public ProductList(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
}
 class SortByID implements Comparator<ProductList>{

	@Override
	public int compare(ProductList o1, ProductList o2) {
		if(o1.id<o2.id) {
			return-1;
		}
		else if(o1.id>o2.id) {
			return 1;
		}
		else {
			return 0;
		}
	}
	 
 }
public class ProductSort {

	public static void main(String[] args) {
		ArrayList<ProductList> pro=new ArrayList<>();
		
		ProductList  p1=new ProductList(101,"Laptop",50000.0f);
		ProductList  p2=new ProductList(103,"Mobile",20000.0f);
		ProductList  p3=new ProductList(102,"Headphone",3000.0f);
		
		pro.add(p1);
		pro.add(p2);
		pro.add(p3);
		
		SortByID sob=new SortByID();
		Collections.sort(pro,sob);
	    
		Iterator<ProductList> it=pro.iterator();
		System.out.println("PID    \tPNAME     \t PPRICE");
		System.out.println("---------------------------------------------------------");
        while(it.hasNext()) {
        	ProductList ob=it.next();
        	System.out.println(ob.id+"    \t"+ob.name+"    \t"+ob.price);
        }
	}

}

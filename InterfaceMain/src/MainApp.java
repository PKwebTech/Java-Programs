import java.util.Scanner;

interface Shape{
	void area();
	void input();
}
class Square implements Shape{

	int side,ar;

	@Override
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of a square");
		side=sc.nextInt();
		
	}
	
	@Override
	public void area() {
		ar=side*side;
		System.out.println("Area of Square="+ar);
		
	}

}

class Reactangle implements Shape{

	int l,b, ar;
	@Override
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length and breadth of a reactangle");
		l=sc.nextInt();
		b=sc.nextInt();
		
	}
	@Override
	public void area() {
		ar=l*b;
		System.out.println("Area of reactangle="+ar);
		
	}

}


public class MainApp {

	public static void main(String[] args) {
		Shape ob;
		ob=new Square();
		ob.input();
		ob.area();//square area
		
		ob=new Reactangle();
		ob.input();
		ob.area();

	}

}

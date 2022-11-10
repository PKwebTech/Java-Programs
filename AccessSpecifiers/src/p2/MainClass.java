package p2;
//private ->within class
//default->within package
//public->pakage to package
//protected->with in a package behaves like default and public and another package only inherited(child class can access these information)
//
//public->protected->default->private

import p1.Employee;
import p3.Student;

public class MainClass {
  public static void main(String[] args) {
	 Employee ob=new Employee();
	 Student ob1=new Student();
	 ob.displayEmployee();
	 ob1.displayStudent();
}
}

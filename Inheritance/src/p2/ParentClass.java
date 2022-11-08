package p2;

public class ParentClass{
	  protected int i, j;  // only access same package and different package with subclasses.
	  public int k;
	  public  ParentClass(int i, int j){
		   System.out.println("Parent class constructor");
	     this.i=i;//this referes to present object
	     this.j=j;
	     k=100;
	   }
	}

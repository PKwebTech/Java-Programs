package com.programs;
public class MemoryManagementJava {
    int i; 
    String s;
    MemoryManagementJava(){
    	i=90;
    	s="Hello";
    }
    
	public static void main(String[] args) {
		
          System.out.println("Main method");
          MemoryManagementJava ob=new MemoryManagementJava();
          System.out.println("ob="+ob);
          System.out.println(ob.i);
          System.out.println(ob.hashCode());
          System.out.println(ob.getClass());
          System.out.println();
        ob=null;
          System.gc();
          System.out.println("ob="+ob);
         // System.out.println(ob.i);
          //System.out.println(ob.s);
          
	}
	@Override
	public void finalize() {
		
			System.out.println("finalize method is called when object becomes null");
			
		}
	}

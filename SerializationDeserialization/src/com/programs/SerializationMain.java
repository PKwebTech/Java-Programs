package com.programs;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

class Student{
	int rollno;
	String name;
	String dept;
}
public class SerializationMain {

	public static void main(String[] args) throws IOException {
		FileOutputStream fo=new FileOutputStream("st.txt");
		PrintStream ps=new PrintStream(fo);
		Student sob=new Student();
		sob.rollno=1111;
		sob.name="Kavita";
		sob.dept="CSE";
		ps.println(sob.rollno);
		ps.println(sob.name);
		ps.println(sob.dept);
	    fo.close();
	    ps.close();
	    System.out.println("Student object is writen to the file");

	}

}

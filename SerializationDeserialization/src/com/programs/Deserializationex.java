package com.programs;

import java.io.BufferedReader;
import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStreamReader;

class Student1{
	int rollno;
	String name;
	String dept;
	@Override
	public String toString() {
		return "Student1 [rollno=" + rollno + ", name=" + name + ", dept=" + dept + "]";
	}
}
public class Deserializationex {

	public static void main(String[] args) throws IOException {
		FileInputStream f1=new FileInputStream("st.txt");
		BufferedReader br=new BufferedReader(new InputStreamReader(f1));
		
		Student1 s1=new Student1();
		s1.rollno=Integer.parseInt(br.readLine());
		s1.name=br.readLine();
		s1.dept=br.readLine();
		f1.close();
		br.close();
		
		System.out.println(s1);

	}

}

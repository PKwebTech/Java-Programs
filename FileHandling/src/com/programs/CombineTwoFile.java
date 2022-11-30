package com.programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CombineTwoFile {

	public static void main(String[] args) throws IOException {
		FileInputStream f1=new FileInputStream("MyFile.txt");
		FileInputStream f2=new FileInputStream("MyFile1.txt");
		FileOutputStream f3=new FileOutputStream("MyFile3.txt");
		FileInputStream f4=new FileInputStream("MyFile3.txt");
		
		int i=0;
		while((i=f1.read())!=-1) {
			f3.write(i);
		}
		while((i=f2.read())!=-1) {
			f3.write(i);
		}
		while((i=f4.read())!=-1) {
			System.out.print((char)i);
		}
	}

}

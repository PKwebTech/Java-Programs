package com.programs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWrite {

	public static void main(String[] args) throws IOException {
		FileInputStream fin=null;
		FileOutputStream fop=null;
		try {
			 fin=new FileInputStream("MyFile.txt");
			 fop=new FileOutputStream("MyFile1.txt");
			 int i=0;
		
			while((i=fin.read())!=-1) {
				if(i>=97 && i<=122) {
				fop.write(i-32);
				System.out.print((char)(i-32));
				}else {
					fop.write(i);
					System.out.print((char)i);
				}
			}
			System.out.println();
			System.out.println("New File  is copied into MyFile1.txt");
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			fin.close();
			fop.close();
		}
	}

}

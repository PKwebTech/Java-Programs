package com.programs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class CombineFile {

	public static void main(String[] args) throws Exception {
		FileInputStream fis1=new FileInputStream("MyFile.txt");
		FileInputStream fis2=new FileInputStream("MyFile1.txt");
		
		FileOutputStream fos=new FileOutputStream("MyFile2.txt");
		
		//Logically combines more than one file
		SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
		
       int b;
      while((b=sis.read())!=-1) {
    	  fos.write(b);
    	 
      }
           fis1.close();
           fis2.close();
           sis.close();
           fos.close();
           System.out.println("Copliying files is completed");
	}

}

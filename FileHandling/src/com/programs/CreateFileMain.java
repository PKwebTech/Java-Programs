package com.programs;

import java.io.File;
import java.io.IOException;

public class CreateFileMain {

	public static void main(String[] args) throws IOException {
	  File fob=new File("MyFile1.txt");
	  System.out.println("Creating File");
	  if(fob.createNewFile()) {
		  System.out.println("File Created");
	  }
	  else {
		  System.out.println("File Allready Exist");
	  }
	}

}

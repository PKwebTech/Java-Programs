package com.programs;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) throws IOException {
		FileOutputStream fob=null;
		try {
			fob=new FileOutputStream("MyFile.txt");
			fob.write(65);
			fob.write(66);
			fob.write(67);
			fob.write(68);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			fob.close();
		}
	}

}

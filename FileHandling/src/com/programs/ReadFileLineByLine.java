package com.programs;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFileLineByLine {

	public static void main(String[] args) throws IOException {
		FileInputStream  fis=new FileInputStream("MyFile1.txt");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(fis));
		String s=null;
		while((s=br.readLine())!=null) {
			System.out.println(s);
		}
	}

}

package com.cg.demo.ios;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStreamDemo {
public static void main(String[] args) throws IOException {
	System.out.println("start");
	FileInputStream fis=new FileInputStream("D:\\desktop\\sample.txt");
	while(fis.available() > 0)
	{
	System.out.print((char) fis.read());	
	}
	fis.close();
}
}

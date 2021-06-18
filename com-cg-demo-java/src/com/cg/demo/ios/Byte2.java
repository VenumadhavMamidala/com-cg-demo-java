//package com.cg.demo.ios;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//
//public class Byte2 {
//public static void main(String[] args) throws IOException {
//	FileInputStream fis=new FileInputStream("D:\\Education\\Don.txt");
//	while(fis.available()>0)
//	{
//		System.out.println((char)fis.read());
//	}
//	fis.close();
//}
//}
package com.cg.demo.ios;

import java.io.*;

public class Byte2 {

	public static void main(String[] args) throws IOException {

		String str="file text another time";
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream("D:\\desktop\\sample.txt");
			byte[] bytesArray=str.getBytes();
			fos.write(bytesArray);
		}
		catch(IOException ioe) {
			System.out.println("wrong");
		}
		if(fos!=null) {
			fos.close();
		}
		System.out.println("end");
	}
}
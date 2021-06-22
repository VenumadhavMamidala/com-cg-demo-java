package com.cg.demo.ios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//import java.io.DataInputStream;
//import java.io.DataOutputStream;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;

public class Data {
public static void main(String[] args) throws IOException  {
	DataOutputStream dos=new DataOutputStream(new FileOutputStream("D:\\desktop\\sample.txt"));
	DataInputStream dis=new DataInputStream(new FileInputStream("D:\\desktop\\sample.txt"));
	dos.writeInt(123455);
	int i=dis.readInt();
	System.out.println(i);
	dos.close();
	dis.close();
	System.out.println("end");
}
}

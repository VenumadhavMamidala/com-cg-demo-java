package com.cg.demo.ios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferDemo2 {
public static void main(String[] args) throws IOException {
	FileWriter fw=new FileWriter("D:\\desktop\\sample.txt");
	BufferedWriter bw=new BufferedWriter(fw);
	String str="nikal";
	bw.write(str);
	bw.close();
	System.out.println("end");
}
}

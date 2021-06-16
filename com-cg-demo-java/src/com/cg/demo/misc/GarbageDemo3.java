package com.cg.demo.misc;

public class GarbageDemo3 {
	public void finalise() throws Throwable {
		System.out.println("gc");
		
		
	}
public static void main(String[] args) {
	GarbageDemo3 g3=new GarbageDemo3();
	GarbageDemo3 g31 =new GarbageDemo3();
	g3=g31;
	System.gc();
	System.out.println("end");
}
}

package com.cg.demo.misc;

public class GarbageDemo2 {
   public void finalise() {
	System.out.println("gc");
}
	public static void main(String[] args) {
		GarbageDemo2 g=new GarbageDemo2();
		GarbageDemo2 g1=new GarbageDemo2();
		g=null;
		g1=null;
		System.gc();
		System.out.println("end");
	}
}

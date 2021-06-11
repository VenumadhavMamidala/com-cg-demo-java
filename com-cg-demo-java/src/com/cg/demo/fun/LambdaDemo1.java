package com.cg.demo.fun;

// 1. by implementing the interface  
public class LambdaDemo1 implements MyInt {
	public static void main(String[] args) {
		LambdaDemo1 obj = new LambdaDemo1();
		obj.absMethod(10);
	}
	@Override
	public void absMethod(int i) {
		System.out.println("absMethod");
	}
}
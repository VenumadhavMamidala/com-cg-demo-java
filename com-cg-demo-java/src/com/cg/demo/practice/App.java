package com.cg.demo.practice;


public class App extends App2 {
	public void m2() {
		System.out.println("m2");
	}
	
public static void main(String[] args) {
	App a=new App();
	a.m1();
	a.m2();
}
}

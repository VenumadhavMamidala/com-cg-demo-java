package com.cg.demo.practice;

public class App4 implements App3,App5,App10{
	public void me1() {
System.out.println("me1");		
	}
	public void me2() {
		System.out.println("me2");		
			}
	public void me3() {
		System.out.println("me3");		
			}
	public void me4() {
		System.out.println("me4");		
			}
	public void mee1() {
		System.out.println("mee1");		
			}
			public void mee2() {
				System.out.println("mee2");		
					}
			public void mee3() {
				System.out.println("mee3");		
					}
			public void mee4() {
				System.out.println("mee4");		
					}
	
public static void main(String[] args) {
	App4 a1 = new App4();
	a1.me1();
	a1.me2();
	a1.me3();
	a1.me4();
	a1.mee1();
	a1.mee2();
	a1.mee3();
	a1.mee4();
}
}

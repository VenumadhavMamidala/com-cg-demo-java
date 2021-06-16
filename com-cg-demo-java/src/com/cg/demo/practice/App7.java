package com.cg.demo.practice;

public class App7 {
//	public static void some3() {
//		System.out.println("some3");
//	}

	public static void main(String[] args) {
		App6 a9 = new App6() {
			@Override
			public void some2() {
				System.out.println("some2");

			}

			@Override
			public void some1() {
				System.out.println("some1");

			}
		};
//        App7.some3();
        a9.some4();
		System.out.println("end");
	}
}

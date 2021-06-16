package com.cg.demo.practice;

public interface App6 {
public void some1();
public void some2();
public static void some3() {
	System.out.println("some three");
}
public default void some4() {	
	System.out.println("some4");
}
}

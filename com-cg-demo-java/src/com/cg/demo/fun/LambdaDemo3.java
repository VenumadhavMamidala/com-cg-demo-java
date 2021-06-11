package com.cg.demo.fun;

// 3. by lambda expression () -> {}  
public class LambdaDemo3 {

	public static void main(String[] args) {

	MyInt obj= (int i) -> {
		System.out.println("absMethod");
	};
	obj.absMethod(10);

	}
}
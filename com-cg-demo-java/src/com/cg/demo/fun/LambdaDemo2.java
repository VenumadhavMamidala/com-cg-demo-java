// 2. by anonymous inner class 

package com.cg.demo.fun;

public class LambdaDemo2 {
	public static void main(String[] args) {
         MyInt obj=new MyInt() {
			
			@Override
			public void absMethod(int i) {
				// TODO Auto-generated method stub
				
			}
		};
		obj.absMethod(10);
	}
}

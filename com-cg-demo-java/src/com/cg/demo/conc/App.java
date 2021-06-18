package com.cg.demo.conc;

public class App implements Runnable{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+ " - " +i);
		}
	}
	
	
public static void main(String[] args) {
	for(int i=0;i<=10;i++) {
		App r=new App();
		Thread t=new Thread(r);
		t.start();
	}
}
}

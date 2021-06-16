package com.cg.demo.multi;

public class ThreadDemo3 extends Thread {

	public void printLoop() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	@Override
	public void run() {
		this.printLoop();
	}

	public static void main(String[] args) throws InterruptedException {

		ThreadDemo obj = new ThreadDemo();
		ThreadDemo obj2 = new ThreadDemo();
		ThreadDemo obj3 = new ThreadDemo();
		
		obj.start();
	    obj.checkAccess();
	    System.out.println(obj.getClass());
	 
	    System.out.println(obj.isAlive());
	    System.out.println(obj2.isAlive());
	    System.out.println(obj2.isAlive());
		obj.setPriority(MIN_PRIORITY);
		System.out.println(obj.getPriority());
		obj.setName("First Thread");
		System.out.println(obj.getName());	
		obj.join();
		System.out.println(obj.isAlive());
		System.out.println(obj.getState());
		System.out.println(obj2.getState());
		System.out.println(obj3.getState());
		
//		obj.printLoop();
			
		obj2.start();
		System.out.println(obj.isAlive());
		System.out.println(obj2.isAlive());
		System.out.println(obj3.isAlive());
		obj2.setPriority(MAX_PRIORITY);
		System.out.println(obj.getPriority());
		obj2.setName("Second Thread");
		System.out.println(obj2.getName());
		obj2.join();
		
		
		obj3.start();
		System.out.println(obj.isAlive());
		System.out.println(obj2.isAlive());
		System.out.println(obj3.isAlive());
		obj3.setPriority(6);
		System.out.println(obj.getPriority());
		obj3.setName("Third Thread");
		System.out.println(obj3.getName());
		System.out.println(obj.getState());
		System.out.println(obj2.getState());
		System.out.println(obj3.getState());
//		obj2.printLoop();
//		obj3.printLoop();
	}
}
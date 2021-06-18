//package com.cg.demo.conc;
//
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
//import java.
//public class ExPatDemo implements Runnable{
//	public void run() {
//		for(int i=0;i<=10;i++) {
//			System.out.println(Thread.currentThread().getName()+ " - " +i);
//		}
//	}
//public static void main(String[] args) {
//	ExPatDemo exp=new ExPatDemo();
//	ExecutorService exService=Executor.newSingleThreadExecuter();
//	for(int i=0;i<=10;i++) {
//		exService.execute(exp);
//	}
//}
//}

package com.cg.demo.conc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExPatDemo implements Runnable {

	public static void main(String[] args) {

		// 0. using Thread object
//		for (int i = 1; i <= 10; i++) {
//			Thread thread = new Thread(new App());
//			thread.start();
//		}

		ExPatDemo exp = new ExPatDemo();

		// 1. using newSingleThreadExecutor() method
		// creates an Executor that uses a single worker thread operating off an
		// unbounded queue

//		ExecutorService exService = Executors.newSingleThreadExecutor();

		// 2. using newCachedThreadPool() method
		// creates a thread pool that creates new threads as needed but will reuse
		// previously constructed threads when they are available.
		
//		ExecutorService exService = Executors.newCachedThreadPool();
//		ExecutorService exService = Executors.newFixedThreadPool(7);
		
		ExecutorService exService = Executors.newScheduledThreadPool(6);
		for (int i = 1; i <= 10; i++) {
			exService.execute(exp);
		}
		exService.shutdown();
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " - " + i);
		}
	}
}
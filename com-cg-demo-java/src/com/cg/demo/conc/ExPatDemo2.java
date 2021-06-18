package com.cg.demo.conc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//import java.util.concurrent.Executors;

public class ExPatDemo2 implements Runnable
{
	@Override
	public void run() {
	for(int i=0;i<=10;i++) {
		System.out.println(Thread.currentThread().getName()+" - "+i);
	}
		
	}
	public static void main(String[] args) {
	
		ExPatDemo2 exPat=new ExPatDemo2();
		ExPatDemo2 exPat1=new ExPatDemo2();
		
		ExecutorService exService=Executors.newSingleThreadExecutor();
		exService.execute(exPat);
		
		ExecutorService exService2=Executors.newSingleThreadExecutor();
		exService2.execute(exPat);
		
		ExecutorService exService3=Executors.newCachedThreadPool();
		exService3.execute(exPat);
		
		ExecutorService exService4=Executors.newFixedThreadPool(5);
		exService4.execute(exPat);
		
		ExecutorService exService5=Executors.newCachedThreadPool();
		exService5.execute(exPat);
		
		ExecutorService exService6=Executors.newFixedThreadPool(5);
		exService6.execute(exPat1);
	}

	
}
package com.cg.demo.col;

import java.util.*;

public class ColDemoQueue {
	public static void main(String[] args) {
		PriorityQueue myQ = new PriorityQueue();
		myQ.add("cap");
		myQ.add("venu");
		myQ.add("vaman");
		myQ.add("vaman");
		myQ.add("arif");
//		myQ.add(null);
//		myQ.add(null);
//		myQ.add();
		while(myQ.peek()!=null)
		{
			System.out.println(myQ.poll());
		}
		
		PriorityQueue<Integer> myQ1 = new PriorityQueue<>();
		myQ1.add(1);
		myQ1.add(2);
		myQ1.add(3);
		myQ1.add(4);
//		myQ1.add();
		myQ1.add(4);
//	    myQ1.add(5.5);
		while(myQ1.peek()!=null)
		{
			System.out.println(myQ1.poll());
		}
		
		
		PriorityQueue<Double> myQ2 = new PriorityQueue<>();
		myQ2.add(99.9);
		myQ2.add(98.9);
		myQ2.add(97.9);
//	    myQ2.add(96);
		while(myQ2.peek()!=null)
		{
			System.out.println(myQ2.poll());
		}
		
		PriorityQueue<String> myQ3 = new PriorityQueue<>();
		myQ3.add("venu");
		myQ3.add("vejay");
		myQ3.add("virat");
		myQ3.add("kohli");
		myQ3.add("arjun");
		myQ3.add("99");
//		mySet3.add(97.9);
		System.out.println(myQ3);
		System.out.println(myQ3.contains("kanni"));
		System.out.println(myQ3.contains("kohli"));
//		System.out.println(myQ3.get(2));
//		System.out.println(myQ3.get(5));
//		myQ3.set(5,"78");
		System.out.println(myQ3);
		System.out.println(myQ3.isEmpty());
		myQ3.remove("virat");
		System.out.println(myQ3);
		for(String k:myQ3)
		{
			System.out.println(k);
		}
	
	}
}

package com.cg.demo.col;

import java.util.*;
//Homogeneous
public class CalDemoTreeSet {
	public static void main(String[] args) {
		TreeSet mySet = new TreeSet();
		mySet.add(10);
		mySet.add(20);
		mySet.add(50);
		System.out.println(mySet);
		
		TreeSet<Integer> mySet1 = new TreeSet<>();
		mySet1.add(1);
		mySet1.add(2);
		mySet1.add(3);
		mySet1.add(4);
//	    mySet.add(5.5);
		System.out.println(mySet);
		
		TreeSet<Double> mySet2 = new TreeSet<>();
		mySet2.add(99.9);
		mySet2.add(98.9);
		mySet2.add(97.9);
//	    mySet2.add(96);
		System.out.println(mySet2);
		
		TreeSet<String> mySet3 = new TreeSet<>();
		mySet3.add("venu");
		mySet3.add("vejay");
		mySet3.add("virat");
		mySet3.add("kohli");
		mySet3.add("arjun");
		mySet3.add("99");
//		mySet3.add(97.9);
		System.out.println(mySet3);
		System.out.println(mySet3.contains("kanni"));
		System.out.println(mySet3.contains("kohli"));
		System.out.println(mySet3);
		System.out.println(mySet3.isEmpty());
		mySet3.remove("virat");
		System.out.println(mySet3);
		for(String k:mySet3)
		{
			System.out.println(k);
		}
		
		Iterator<String> i=mySet3.iterator();
		while(i.hasNext())			
		{
			System.out.println(i.next());
		}

	}
}

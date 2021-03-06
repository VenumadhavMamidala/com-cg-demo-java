package com.cg.demo.col;

import java.util.*;

public class ColDemoHashLink {
	public static void main(String[] args) {
		LinkedHashSet mySet = new LinkedHashSet();
		mySet.add(10);
		mySet.add("venu");
		mySet.add(50.24);
		System.out.println(mySet);
		
		LinkedHashSet<Integer> mySet1 = new LinkedHashSet<>();
		mySet1.add(1);
		mySet1.add(2);
		mySet1.add(3);
		mySet1.add(4);
//	    mySet.add(5.5);
		System.out.println(mySet);
		
		LinkedHashSet<Double> mySet2 = new LinkedHashSet<>();
		mySet2.add(99.9);
		mySet2.add(98.9);
		mySet2.add(97.9);
//	    mySet2.add(96);
		System.out.println(mySet2);
		
		LinkedHashSet<String> mySet3 = new LinkedHashSet<>();
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

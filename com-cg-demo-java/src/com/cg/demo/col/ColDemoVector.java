package com.cg.demo.col;

import java.util.*;

public class ColDemoVector {
	public static void main(String[] args) {
		Vector myList = new Vector();
		myList.add(10);
		myList.add("venu");
		myList.add(50.24);
		System.out.println(myList);
		
		Vector<Integer> myList1 = new Vector<>();
		myList1.add(1);
		myList1.add(2);
		myList1.add(3);
		myList1.add(4);
//	    myList1.add(5.5);
		System.out.println(myList1);
		
		Stack stack=new Stack();
//		System.out.println(stack.remove(0));
		System.out.println(stack.size());
		
		
		Vector<Double> myList2 = new Vector<>();
		myList2.add(99.9);
		myList2.add(98.9);
		myList2.add(97.9);
//	    myList2.add(96);
		System.out.println(myList2);
		Collections.sort(myList2);
		System.out.println(myList2);
		Collections.sort(myList2,Collections.reverseOrder());
		System.out.println(myList2);
		
		Vector<String> myList3 = new Vector<>();
		myList3.add("venu");
		myList3.add("vejay");
		myList3.add("virat");
		myList3.add("rahul");
		myList3.add("hardik");
		myList3.add("bu");
		myList3.add("kohli");
		myList3.add("arjun");
		myList3.add("99");
//		myList3.add(97.9);
		System.out.println(myList3);
		System.out.println(myList3.contains("kanni"));
		System.out.println(myList3.contains("kohli"));
		System.out.println(myList3.get(2));
		System.out.println(myList3.get(5));
		myList3.set(5,"78");
		System.out.println(myList3.capacity());
		System.out.println(myList3);
		System.out.println(myList3.isEmpty());
		myList3.remove("virat");
		System.out.println(myList3);
		for(String k:myList3)
		{
			System.out.println(k);
		}
		for(int i=0;i<myList3.size();i++)
		{
			System.out.println(myList3.get(i));
		}

		Collections.sort(myList3);
		System.out.println(myList3);
		Collections.sort(myList3,Collections.reverseOrder());
		System.out.println(myList3);
		System.out.println(myList3.capacity());

	}
}

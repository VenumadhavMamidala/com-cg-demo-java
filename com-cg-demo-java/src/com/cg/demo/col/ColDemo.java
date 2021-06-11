package com.cg.demo.col;

import java.util.*;

public class ColDemo {
	public static void main(String[] args) {
		ArrayList myList = new ArrayList();
		myList.add(10);
		myList.add("venu");
		myList.add("venu");
		myList.add(null);
		myList.add(null);
		myList.add(50.24);
		System.out.println(myList);
		
		ArrayList<Integer> myList1 = new ArrayList<>();
		myList1.add(1);
		myList1.add(2);
		myList1.add(3);
		myList1.add(4);
//	    myList1.add(5.5);
		System.out.println(myList1);
		
		ArrayList<Double> myList2 = new ArrayList<>();
		myList2.add(99.9);
		myList2.add(98.9);
		myList2.add(97.9);
//	    myList2.add(96);
		System.out.println(myList2);
		Collections.sort(myList2);
		System.out.println(myList2);
		Collections.sort(myList2,Collections.reverseOrder());
		System.out.println(myList2);
		
		ArrayList<String> myList3 = new ArrayList<>();
		myList3.add("venu");
		myList3.add("vejay");
		myList3.add("virat");
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
		
		Iterator<String> i=myList3.iterator();
		while(i.hasNext())			
		{
			System.out.println(i.next());
		}
		
		ListIterator<String> i2=myList3.listIterator();
		while(i2.hasNext())			
		{
			System.out.println(i2.next());
		}
		while(i2.hasPrevious())			
		{
			System.out.println(i2.previous());
		}
		

	}
}

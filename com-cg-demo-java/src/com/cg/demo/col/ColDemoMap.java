package com.cg.demo.col;

import java.util.*;

public class ColDemoMap {
public static void main(String[] args) {
	HashMap<Integer,String> h=new HashMap<>();
	h.put(18,"virat");
	h.put(17,"Abd");
	h.put(1,"Rahul");
	h.put(10,"sachin");
	h.put(7,"Dhoni");
	System.out.println(h.get(1));
	System.out.println(h.containsKey(1));
	System.out.println(h.containsValue("Abd"));
	System.out.println(h.keySet());
	System.out.println(h.values());
	System.out.println(h);
	
	
	for(Map.Entry<Integer,String> data = h.entrySet())
	{
		System.out.println(data.getKey()+" "+data.getValue());
	}
	
}
}

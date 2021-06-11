package com.cg.demo.col;
import java.util.*;
  
public class ColDemoStack {
  
    public static void main(String args[])
    {
        Stack<String> stack = new Stack<String>();
        stack.push("venu");
        stack.push("kanni");
        stack.push("vaman");
        stack.push("sir");
        stack.push("java");
        System.out.println(stack);
        System.out.println(stack.push("sir"));
        System.out.println(stack.peek());
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
       
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
//      stack.pop();
//      System.out.println(stack);
    }
}
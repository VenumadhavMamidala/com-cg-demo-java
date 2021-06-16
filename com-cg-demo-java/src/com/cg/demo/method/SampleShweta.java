
//
//import java.util.Scanner;
//
//public class SampleShweta {
//public static void main(String[] args) {
//	System.out.println("char array");
//	Scanner sc=new Scanner(System.in);
//	System.out.println("enter size");
//	int size=sc.nextInt();
//	char[] ch=new char[size];
//	System.out.println(ch);
//	System.out.println("enter elements");
//	for(int i=0;i<ch.length;i++) {
//		int[] c=sc.charAt(i);
//	}
//	}
//}

package com.cg.demo.method;
class box 
    {
        int width;
        int height;
        int length;
    } 
    class mainclass 
    {
        public static final void main(String args[]) 
        {        
            box obj1 = new box();
            box obj2 = new box();
            obj1.height = 1;
            obj1.length = 2;
            obj1.width = 1;
            obj2 = obj1;
            System.out.println(obj2.height);
        } 
    }

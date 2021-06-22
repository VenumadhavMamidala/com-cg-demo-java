package com.cg.demo.ios;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//package com.cg.demo.ios;
//
//public class ex {
//public static void main(String[] args) {
////	int x=1,y=6;
////	while(y--) {
////		x++;
////	}
////	System.out.println("x="+x+"y="+y);
//	
//	
//	
//}
//}


//interface Demo
//{
//	int i=20;
//}
//public class Demoimpl implements Demo
//{
//	public static void main(String[] args) {
//		i+=20;
//		System.out.println("i="+i+20);
//	}
//}

//public class Demoimpl
//{
//	public static void main(String[] args) {
//		String str1="abc";
//		String str2="def";
//		String str3=str1.concat(str2);
//		str1.concat(str2);
//		System.out.println(str1);
//	}
//}

//class Demoimpl
//{
//	public static void main(String[] args) {
//		box obj =new box();
//		obj.volume();
//		System.out.println(obj.volume);
//	}
//}

//abstract class Bird{
//	static int showAge() {
//		int age=15;
//		System.out.println(age);
//	}}
//public class AngryBird extends Bird{
//	public static void main(String[] args) {
//		
//	
//	AngryBird a=new AngryBird();
//	a.showAge();
//}
//}
//public class Test{
//	public static void main(String[] args) {
//		for(int i=0;i<2;i++) {
//			for(int j=2;j>=0;j--) {
//				if(i==j)break;
//				System.out.println("i="+i+"j="+j);
//				
//			}
//		}
//	}
//}

//public void divide(int x,int y)
//{
//	int a,ans;
//	try {
//		a=5,b=10;
//		ans=a/b;
//		System.out.println("mobile");
//	}
//	catch(Exception e) {
//		ans=0;
//		System.out.println("phone");
//	}finally {
//		System.out.println("all is well");
//	}
//}

//public class Test{
//	public static void main(String[] args) {
//		Pattern p=Pattern.compile("a*b");
//		Matcher m=p.matcher("b");
//		boolean b=m.matches();
//		System.out.println(b);
//	}
//}
import java.util.*;
public class Test{
	public static void main(String[] args) {
		String s="Khadaksingh le khadakne se khadakti hain khidkiyaan khidkiyon ke khadakne se khadakta hain Khadaksingh";
		Scanner scanner=new Scanner(s);
		scanner.useDelimiter("khadak");
		while(scanner.hasNext())
		{
			System.out.println(" "+scanner.next());
		}
	}
}

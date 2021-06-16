package com.cg.demo.practice;
//
//public interface App10 {
//	public void mee1(); 
//}

class  App10
  {
      public static void main(String[]args)
      {
//          String[] elements = { "for", "tea", "too" };
//          String first = (elements.length > 0) ? elements[0]: null;
    	  String s="sachin";
    	  String s2="sachin";
    	  String s3="rohanvarma";
    	  String s4=String.join("-",s3, s2);
    	  System.out.println(s4);
    	  System.out.println(s3.substring(1, 4));
    	  System.out.println(s.compareTo(s2));
    	  System.out.println(s.compareTo(s3));
    	  System.out.println(s3.compareTo(s2));
      }
  }
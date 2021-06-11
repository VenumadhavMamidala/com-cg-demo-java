package com.cg.demo.oop;
//class Mcq {
//        public static void main(String args[]) 
//        {
//            boolean var1 = true;
//	    boolean var2 = false;
//	    if (var1)
//	        System.out.println(var1);
//	    else
//	        System.out.println(var2);
//       } 
//    }




//class 	Mcq 
//    {
//        public static void main(String args[]) 
//        {
//            int a[] = {1,2,3,4,5};
//	    int d[] = a;
//	    int sum = 0;
//	    for (int j = 0; j < 3; ++j)
//                sum += (a[j] * d[j + 1]) + (a[j + 1] * d[j]);
//	    System.out.println(sum);
//        } 
//    }




//class 	Mcq 
//{
// public static void main(String[] args) 
//  {
//  int []x[] = {{1,2}, {3,4,5}, {6,7,8,9}};
//  int [][]y = x;
//  System.out.println(y[2][1]);
//  }
//}

//class Mcq 
//{
//    public static void main(String args[]) 
//    {
//   	    int array_variable [] = new int[10];
//    for (int i = 0; i < 10; ++i) {
//            array_variable[i] = i/2;
//            array_variable[i]++;
//            System.out.print(array_variable[i] + " ");
//            i++;
//        }
//
//    } 
//}


//class Mcq 
//{
//    public static void main(String args[]) 
//    {
//        int x;
//        x = 5;
//        {
//        int y = 6;
//        System.out.print(x + " " + y);
//        }
//        System.out.println(x + " " + y);
//    } 
//}
 

/////ask sir
//class Mcq 
//{
//    public static void main(String args[]) 
//    {
//        double a = 295.04;
//        int  b = 300;
//        byte c = (byte) a;
//        byte d = (byte) b;
//        System.out.println(c);
//        
//        System.out.println(c + " "  + d);
//    } 
//}


class A 
{
     public int calculate(int a, int b) { return 1; } 
} 
class B extends A 
{ 
    public int calculate(int a, int b) { return 2; } 
} 
 public class Mcq 
 {
    public static void main(String args[]) 
    { 
        B object  = new B(); 
        System.out.print("b is " + object.calculate(0, 1));  
    } 
}

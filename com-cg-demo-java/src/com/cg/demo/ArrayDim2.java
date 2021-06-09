package com.cg.demo;

import java.util.Scanner;

public class ArrayDim2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size : ");

		int size = sc.nextInt();
		

		int[][] arr = new int[size][];
        arr[0]=new int[3];
        arr[1]=new int[1];
        arr[2]=new int[2];
		System.out.println(arr.length);

		for (int i = 0; i < arr.length; i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Please enter elements:");
				arr[i][j] = sc.nextInt();
				
			}
			}

		for (int i = 0; i < arr.length; i++) {
			for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}

	}

}
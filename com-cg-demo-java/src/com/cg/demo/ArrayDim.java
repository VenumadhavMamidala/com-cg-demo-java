package com.cg.demo;

import java.util.Scanner;

public class ArrayDim {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size1 : ");

		int size1 = sc.nextInt();
		System.out.println("Enter size2 : ");
		int size2 = sc.nextInt();

		int[][] arr = new int[size1][size2];

		System.out.println(arr.length);

		for (int i = 0; i < arr.length; i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.println("Please enter elements:");
				arr[i][j] = sc.nextInt();
				
			}
			}

		for (int i = 0; i < arr.length; i++) {
			for(int j=0;j<arr.length;j++) {
			System.out.print(arr[i][j]);
			}
			System.out.println();
		}

	}

}
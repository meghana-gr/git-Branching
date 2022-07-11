package com.me.assignment;

import java.util.Scanner;

public class PrintOddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n = scan.nextInt();
		System.out.println("Enter the array elements");
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(!((array[i]%2)==0)) {
				System.out.println(array[i]);
			}
		}
	}

}

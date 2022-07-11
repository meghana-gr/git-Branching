package com.me.assignment;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the arraysize");
		int n=scan.nextInt();
		int []array=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=scan.nextInt();
		}
		scan.close();
		for (int i = n-1; i >= 0; --i) {
			System.out.println(array[i] + " ");
		}
	}

}

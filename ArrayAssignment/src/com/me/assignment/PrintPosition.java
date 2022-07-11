package com.me.assignment;

import java.util.Scanner;

public class PrintPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the arraysize");
		int n=scan.nextInt();
		int []array=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=scan.nextInt();
		}
		System.out.println("Enter the number to search");
		int num=scan.nextInt();
		scan.close();
		for(int i=0;i<n;i++) {
			if(array[i]==num) 
				System.out.println("index of "+num+" is "+i);
		}
		
	}

}

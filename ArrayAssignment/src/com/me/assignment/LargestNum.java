package com.me.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the arraysize");
		int n=scan.nextInt();
		int []array=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=scan.nextInt();
		}
		System.out.println(Arrays.toString(array));
		scan.close();
		int large=array[0];
		for(int i=0;i<n;i++) {
			if(array[i]>large) {
				large=array[i];
			}
		}
		System.out.println("largest number in array "+large);
	}

}

package com.me.assignment;

import java.util.Scanner;

public class AdjecentArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter the arraysize");
int n=scan.nextInt();
int []array=new int[n];
int sum=0;
for(int i=0;i<n;i++) {
	array[i]=scan.nextInt();
}
scan.close();
for(int i=0;i<n;i++) {
	sum+=array[i];
}
System.out.println("sum of adjacent array number"+sum);
	}

}

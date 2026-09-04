package com.practice;

import java.util.Scanner;

public class AvgArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=5;
		int[] arr=new int[n];
		int sum=0;
		int avg=0;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			avg=sum/(n-1);
		}
		System.out.println(avg);

	}

}

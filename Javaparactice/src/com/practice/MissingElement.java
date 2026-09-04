package com.practice;

public class MissingElement {

	public static void main(String[] args) {
	int[] arr= {1,2,3,5};
	int s=0;
	
    int sum=0;
    for(int i=0;i<arr.length;i++) {
    	sum=sum+arr[i];
    	
    }
    for(int i=1;i<=5;i++) {
    	s+=i;
    }
    int a=s-sum;
    System.out.println(a);
	}

}

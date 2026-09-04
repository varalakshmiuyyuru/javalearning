package com.practice;

public class Majority {

	public static void main(String[] args) {
		int[] arr= {1,2,3,2,3,3,3,3,3,3,2,3,2};
		int majority=-1;
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				count++;
			}
			}
			if(count>arr.length/2) {
				majority=arr[i];
				break;
			}
		
		}
		System.out.println(majority);
		
	}

}

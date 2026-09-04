package com.practice;
public class Move0sLast {
	public static void main(String[] args) {
		int [] arr= {0,1,0,3,12};
		int index=0;//updating non zero elements
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[index]=arr[i];
				arr[index]=arr[i];
				index++;
			}
		}
		while(index<arr.length) {
			arr[index]=0;
			index++;
		}
		for(int a: arr) {
			System.out.print(" "+a);
		}
	}
}

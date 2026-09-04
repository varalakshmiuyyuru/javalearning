package com.practice;

public class InsertingAnElementArray {

	public static void main(String[] args) {
		int[] arr= {12,14,16,19};
		int element=15;
		int position=2;
		//creating new array
		int newarray[]=new int[arr.length+1];
		for(int i=0;i<arr.length;i++) {
		newarray[i]=arr[i];
	}
		newarray[position]=element;
		for(int i=position;i<arr.length;i++) {
			newarray[i+1]=arr[i];
		}
		for(int i=0;i<newarray.length;i++) {
			System.out.print(" "+newarray[i]);
		}
	}
}

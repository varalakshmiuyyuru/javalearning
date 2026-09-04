package com.practice;

public class DeletingAnElement {

	public static void main(String[] args) {
		int[] arr= {20,34,76,87};
		int position=3;
		int[] newarray=new int[arr.length-1];
		for(int i=0;i<position;i++) {
			newarray[i]=arr[i];
			
		}
		for(int i=0;i<newarray.length;i++) {
			newarray[i]=arr[i+1];
			
		}
		System.out.println();
		for(int x:newarray) {
			System.out.print(" "+x);
		}
		

	}

}

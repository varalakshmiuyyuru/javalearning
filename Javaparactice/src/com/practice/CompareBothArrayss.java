package com.practice;

public class CompareBothArrayss {

	public static void main(String[] args) {
		int[] arr1= {1,2,3,4};
		int[] arr2= {1,2,3,5};
		boolean res=false;
		for(int i=0;i<arr1.length;i++) {			
				if(arr1[i]==arr2[i]) {
					res=true;
					System.out.println("elements are same ");
					
				}else {
					System.out.println("elements are not same");
					break;
					
				}
				
			
		}
	}

}

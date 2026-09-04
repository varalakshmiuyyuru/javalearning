package com.practice;

public class ThirdLargestValueInArray {

	public static void main(String[] args) {
		
  int [] arr= {20,30,40,50,60,70};
          int largest        =Integer.MIN_VALUE; 
		  int secondLargest  = Integer.MIN_VALUE;
		  int thirdLargest   = Integer.MAX_VALUE;
		  for (int i=0;i<arr.length;i++) {
			  if(arr[i] > largest) {
		      thirdLargest = secondLargest;
		      secondLargest = largest;
		      largest = arr[i];
		  }else if(arr[i] > secondLargest) {
		        thirdLargest = secondLargest;
		        secondLargest = arr[i];
		    }
		    else if(arr[i] > thirdLargest) {
		        thirdLargest = arr[i];
		    }
		}

		System.out.println("Third largest: " + thirdLargest);
	
}
}
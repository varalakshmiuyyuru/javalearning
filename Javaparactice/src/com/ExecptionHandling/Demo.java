	package com.ExecptionHandling;

	public class Demo {

	public static void main(String[] args) {
	    int  total_marks=500;
		int total_subjects=0;
		int marksArray[]=new int[2];
								
		 try {
		// marksArray[2]=20 --> ArrayIndexOutOfBoundsException	
		 marksArray[0]=100;
		 marksArray[1]=80;
		 marksArray[2]=20;//ArrayIndexOutOfBoundsException
		
		 //division of a number with zero	
		 int avg_marks=total_marks/total_subjects;//ArithmeticException
		 
		 }catch(ArithmeticException e) {
			 System.out.println("problem occurd due to invalid input");
			 
	  	}catch(ArrayIndexOutOfBoundsException e) {
		  		System.out.println("Array IndexOut Of Bounds  Exception is occured");
		  	}
     	
		System.out.println("Avarage marks calculated ");
		
		}

	}

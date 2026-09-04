package com.corejava.controlflow;

import com.corejava.arrays.Employee;

/*
 * QUESTION:
 * Write a Java program to print an Inverted Right-Angle Triangle Pattern using stars (*).
 *
 * Example (n = 5):
 *
  *****
  ****
  ***
  **
  *
 */

public class PatternDemo3 {
	
	public static void main(String[] args) {
		
	
		
		
		
		//specify the number of rows
		int rows =5;
		
		//outer for loop to control rows
		for(int i =rows; i>=1; i--) {
			
			
			for(int j =1 ; j<=i; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
	}

}

/*
int rows =3;
* * * *
* * * *
* * * * 
*/







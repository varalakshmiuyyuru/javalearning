package com.corejava.controlflow;


/*
 * Write a program to print a right angle triangle pattern
 * using * (stars or asterisks)
 */
/*
*
* *
* * *
* * * * 
* * * * *
* 
*/



public class PatternDemo2 {
	
	public static void main(String[] args) {
		
		//specify the number of rows
		int rows =5;
		
		// outer for loop to control the number of rows
		for(int i =1; i<=rows;i++) {
			
			// Inner for loop prints stars equal to current row number
			for(int j=1; j<=i; j++) {
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







package com.corejava.controlflow;

/*
 * Write a program to print 4 stars in each row. 
 * 
int rows =3;
* * * *
* * * *
* * * * 
*/




public class PatternDemo1 {
	
	public static void main(String[] args) {
		
		//specify the number of rows
		int rows =10;
		int rowStars=10;
		
		// outer for loop to control the number of rows
		for(int i =1; i<=rows;i++) {
			
			// Inner for loop prints stars equal to current row number
			for(int j=1; j<=rowStars; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}

}








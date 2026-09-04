package com.corejava.arrays;
public class RaggedArrayDemo {

    public static void main(String[] args) {

    	
    	
        // A ragged (jagged) array is a 2D array in which
        // each row can have a different number of columns.

        // Creating and initializing a ragged array
        int[][] numbers = {
                {10, 20},              // Row 0 contains 2 elements
                {30, 40, 50},          // Row 1 contains 3 elements
                {60},                  // Row 2 contains only 1 element
                {70, 80, 90, 100}      // Row 3 contains 4 elements
        };

        // Display the total number of rows
        System.out.println("Total Rows : " + numbers.length);

        // Outer loop traverses each row
        for (int i = 0; i < numbers.length; i++) {

            // Display the current row number
            System.out.println("\nRow " + i);

            // Display the number of columns in the current row
            System.out.println("Number of Columns : " + numbers[i].length);

            // Inner loop traverses each element of the current row
            for (int j = 0; j < numbers[i].length; j++) {

                // Print the current element
                System.out.print(numbers[i][j] + " ");
            }

            // Move to the next line after printing one row
            System.out.println();
        }
    }
}
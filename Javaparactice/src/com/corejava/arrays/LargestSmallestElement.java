package com.corejava.arrays; // Package declaration. This class belongs to the com.codegnan.arrays package.

/*
 Question:
 Write a Java program to find the largest and smallest elements in an integer array.

 Example:
 Input:
 {3, 7, 1, 9, 4}

 Output:
 Largest: 9
 Smallest: 1
*/

public class LargestSmallestElement { // Class declaration.

    public static void main(String[] args) { // Main method - execution starts here.

        // Declare and initialize the integer array.
        int[] arr = {3, 7, 1, 9, 4};

        // Assume the first element is the largest initially.
        int largest = arr[0];

        // Assume the first element is the smallest initially.
        int smallest = arr[0];

        // Traverse the entire array.
        for (int i = 0; i < arr.length; i++) {

            // If the current element is greater than the current largest,
            // update the largest value.
            if (arr[i] > largest) {
                largest = arr[i];
            }

            // If the current element is smaller than the current smallest,
            // update the smallest value.
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        // Display the largest element.
        System.out.println("Largest: " + largest);

        // Display the smallest element.
        System.out.println("Smallest: " + smallest);
    }
}

/*
Expected Output:
Largest: 9
Smallest: 1
*/
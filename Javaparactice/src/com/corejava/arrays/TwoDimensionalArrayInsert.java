package com.corejava.arrays;
public class TwoDimensionalArrayInsert {

    public static void main(String[] args) {

        // Declare a 2D array with 3 rows (students) and 3 columns (subjects)
        int[][] marks = new int[3][3];

        // -------------------------------
        // Inserting marks into the array
        // -------------------------------

        // Student 1 Marks
        marks[0][0] = 85;   // Subject 1
        marks[0][1] = 90;   // Subject 2
        marks[0][2] = 78;   // Subject 3

        // Student 2 Marks
        marks[1][0] = 76;   // Subject 1
        marks[1][1] = 88;   // Subject 2
        marks[1][2] = 92;   // Subject 3

        // Student 3 Marks
        marks[2][0] = 91;   // Subject 1
        marks[2][1] = 84;   // Subject 2
        marks[2][2] = 89;   // Subject 3

        // -----------------------------------
        // Displaying the marks of each student
        // -----------------------------------

        // Outer loop -> Students (Rows)
        for (int i = 0; i < marks.length; i++) {

            System.out.println("Student " + (i + 1) + " Marks:");

            // Inner loop -> Subjects (Columns)
            for (int j = 0; j < marks[i].length; j++) {

                System.out.println("Subject " + (j + 1) + " = " + marks[i][j]);
            }

            System.out.println(); // Blank line after each student
        }
    }
}
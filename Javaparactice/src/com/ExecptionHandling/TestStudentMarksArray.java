package com.ExecptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestStudentMarksArray {
	
public static void main(String[]args) {
	        Scanner sc = new Scanner(System.in);


	        StudentMarksArray s = new StudentMarksArray();

	        System.out.print("Student number: ");

	        try {

	            int studentNumber = sc.nextInt();

	            s.displayMarks(studentNumber);

	        } catch (InputMismatchException e) {

	            System.out.println("Invalid input. Please enter a number.");

	        }

	        sc.close();
	    }
	

}

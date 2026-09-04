package com.ExecptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentResultCalculator {
	String name;
	StudentResultCalculator(String name){
		this.name=name;
	}
	 void calculateResult() {

	        Scanner sc = new Scanner(System.in);

	        int total = 0;
	        try {

	            for (int i = 1; i <= 5; i++) {

	                System.out.print("Enter marks for Subject " + i + ": ");
	                int marks = sc.nextInt();

	                // Validation
	                if (marks < 0 || marks > 100) {
	                    System.out.println("Marks must be between 0 and 100");
	                    return;
	                }

	                total = total + marks;
	            }

	            double average = total / 5.0;
	            double percentage = (total / 500.0) * 100;

	            System.out.println("\n----- Student Result -----");
	            System.out.println("Student    : " + name);
	            System.out.println("Total      : " + total);
	            System.out.println("Average    : " + average);
	            System.out.println("Percentage : " + percentage + "%");

	        } catch (InputMismatchException e) {

	            System.out.println("Invalid input!");
	            System.out.println("Please enter numeric marks only.");
	        }
	 }

}

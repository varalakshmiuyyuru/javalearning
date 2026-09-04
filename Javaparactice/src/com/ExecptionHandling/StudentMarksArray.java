package com.ExecptionHandling;

public class StudentMarksArray {
	

	    int[] marks = {85, 76, 90, 65, 88};

	    void displayMarks(int studentNumber) {

	        try {

	            // Student number starts from 1
	            System.out.println("Marks : " + marks[studentNumber - 1]);

	        } catch (ArrayIndexOutOfBoundsException e) {

	            System.out.println("Invalid student number.");

	        }
	    }
	}



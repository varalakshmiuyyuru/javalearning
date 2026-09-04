package com.dateandtime.methods;

public class StudentMain {

	public static void main(String[] args) {
		StudentDetails sd=new StudentDetails(0,"","",0.0);
		StudentDetails[] sArray = sd.getStudentList();
		for(int i=0;i<sArray.length;i++) {
			System.out.println("Student ID : " + sArray[i].studentId);
            System.out.println("Student Name : " + sArray[i].studentName);
            System.out.println("Course : " + sArray[i].course);
            System.out.println("Fee : " + sArray[i].fee);

            System.out.println("----------------------");
			
		}

	}

}

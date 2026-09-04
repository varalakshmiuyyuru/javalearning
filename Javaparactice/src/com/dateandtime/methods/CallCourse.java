package com.dateandtime.methods;

import java.util.Scanner;

public class CallCourse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Course name : ");
		 String coursename=sc.nextLine();
	     System.out.println("Course Id : ");
	      int courseId=sc.nextInt();
		 
		 System.out.println("Course fee :  ");
		 int coursefee=sc.nextInt();
		Course cd=new Course(courseId,coursename,coursefee);
		
		sc.close();
		
		
	}

}

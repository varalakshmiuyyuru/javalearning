package com.ExecptionHandling;

public class TestStudent {

	public static void main(String[] args) {
		Student s=new Student("varalakshmi",59.9);
		System.out.println("student :"+s.name);
		System.out.println("percentage :"+s.percentage);
		try {
		s.enrollCourse();
		
		}catch (NotEligibleForCourseException e) {
			System.out.println("not eligible for course enroll ment");
		}
	}

}

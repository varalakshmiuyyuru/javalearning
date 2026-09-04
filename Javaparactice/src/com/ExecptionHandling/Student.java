package com.ExecptionHandling;


class Student {

	String name;
	
	double percentage;
	Student(String name,double percentage){
		this.name=name;
		this.percentage=percentage;
	}
	
	 void enrollCourse() throws NotEligibleForCourseException{
		if(percentage<60) {
			throw new NotEligibleForCourseException("presentage must be more then 60");
		}else {
			System.out.println("successfully enrolled ");
		}
		
	}
	
}

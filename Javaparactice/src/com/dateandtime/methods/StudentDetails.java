package com.dateandtime.methods;

public class StudentDetails {
	int studentId;
	String studentName;
	String course;
	double fee;
	
	public  StudentDetails (int studentId,	String studentName,	String course,double fee) {
		this.studentId=studentId;
		this.studentName=studentName;
		this.course=course;
		this.fee=fee;
	}
	public StudentDetails[] getStudentList() {
		StudentDetails[] sArray= {
				new StudentDetails(10,"Kalpana","java full stack",41000.00),
				new StudentDetails(10,"Varalakshmi","java full stack",41000.00),
				new StudentDetails(10,"siri","python full stack",45000.00),
				new StudentDetails(10,"Jyo","pyhon full stack",41000.00)
		};
		return sArray;
		
	}
	
}

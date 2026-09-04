package com.inheritance.casting;

public class Student {
	int studentId;
	String student;
	String course;
	Trainer trainer;
	public Student(int trainerId, String student,String course,Trainer trainer) {
		super();
		this.studentId = trainerId;
		this.student = student;
		this.trainer=trainer;
		this.course=course;
	}

	public void studentDetails() {
		System.out.println("StudentId : "+studentId);
		System.out.println("Student : "+student);
		System.out.println("Student course : "+course);
		
		System.out.println("Trainer  : " +trainer.name);
		System.out.println("Technology :"+trainer.technology);
	}

}

package com.dateandtime.methods;

public class Student1 {
	int studentId;
	String StudentName;
	int mark1;
	int mark2;
	int mark3;
	public Student1(int studentId,String StudentName,int mark1,int mark2,int mark3){
		this.studentId=studentId;
		this.StudentName=StudentName;
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
	}
	public void displayStudent(Student1 s) {
	 System.out.println(s.studentId);
	 System.out.println(s.StudentName);
	 double percentage=calculatePersentage(s.mark1,mark2,s.mark3);
	 System.out.println(percentage);
	}
	public double calculatePersentage(int mark1,int mark2,int mark3) {
		double persentage=((mark1+mark2+mark3)/300.0)*100;
		return persentage;
	}
	


}

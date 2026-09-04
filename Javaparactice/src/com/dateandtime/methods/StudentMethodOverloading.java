package com.dateandtime.methods;

public class StudentMethodOverloading {
	public void student(String name) {
		System.out.println(name);
	}
	public void student(String name,int age,String course) {
		System.out.print(name+" ");
		System.out.print(age+" ");
		System.out.print(course);
	}

	public static void main(String[] args) {
		StudentMethodOverloading  details=new StudentMethodOverloading();
		details.student("kalpana");
		details.student("kalpana", 20, "SoftwareDeveloper");
	}

}

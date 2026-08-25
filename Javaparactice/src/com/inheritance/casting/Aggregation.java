package com.inheritance.casting;

public class Aggregation {

	public static void main(String[] args) {
		
		Trainer tr=new Trainer(1,"Ajith","java");
		
		Student st=new Student(100,"sam","java",tr);
		
		st.studentDetails();
		tr.teach(st);
	}

}

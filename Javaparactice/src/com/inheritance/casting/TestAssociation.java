package com.inheritance.casting;

public class TestAssociation {

	public static void main(String[] args) {
		Trainer t=new Trainer(2, "sudheer","java");
		Student s=new Student(3,"", null, t);
		t.teach(s);

	}

}

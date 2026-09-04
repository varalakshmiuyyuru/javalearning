package com.inheritance.casting;
	
	public class Trainer {
		int trainerId;
		String name;
		String technology;
	public Trainer(int trainerId, String name,String technology) {
			super();
			this.trainerId = trainerId;
			this.name=name;
			this.technology=technology;
			
		}
	public void teach(Student s) {
		System.out.println(name+" sir  is teaching " +technology+ " to  " +s.student);
	}
}

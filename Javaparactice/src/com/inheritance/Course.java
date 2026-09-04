package com.inheritance;

public class Course extends  ParentCourse{
	int id;
	String courseName;
	public Course() {
		//constructor chaining :calling one constructor from another constructor with in a same class
		this(0,null,0);
	}
	public Course(int id,String courseName) {
		if(courseName==null) {
		this.courseName="Unknown";
		
		}else {
			this.courseName=courseName;
			this.id=id;
		}
	}
	public Course(int id,String courseName,int  parentCourseId) {
		super(parentCourseId);
		this.id=id;
		this.courseName=(courseName==null)?"unknown":"CourseName";
		
				}
	//to string will give the string representation of an object
	//overriding  is happens b/w two classes like parent and child is called runtime polymorphism.
	@Override
   public String toString(){
	return id+" "+courseName+" "+parentCourseId;
   }
}

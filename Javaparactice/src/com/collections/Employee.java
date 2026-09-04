package com.collections;

import java.util.ArrayList;

public class Employee {
	int empid;
	String empName;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid() {
		this.empid=empid;
	}
	public String getempName() {
		return empName;
	}
	public void setempName() {
		this.empName=empName;
	}

	public Employee(int empid,String empName) {
		super();
		this.empid=empid;
		this.empName=empName;
	}

	public String toString() {
		return "Employee[empId="+empid+",empname="+empName;
	}
}

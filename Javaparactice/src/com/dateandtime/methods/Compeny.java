package com.dateandtime.methods;

public class Compeny {
	int compenyId;
	String compenyName;
	int empCount;
	String compenyLocation;
	double compenyTurnover;
 public Compeny(	int compenyId,String compenyName,int empCount,String compenyLocation,double compenyTurnover){
	
	this.compenyId=compenyId;
	this.compenyName=compenyName;
	this.empCount=empCount;
	this.compenyLocation=compenyLocation;
	this.compenyTurnover=compenyTurnover;

 }
 public int getCompenyId() {
	 return compenyId;
	 
	 
 }
 public String getCompenyName() {
	 return compenyName;
	 
	 
 }

 public int getEmployeeCount() {
	 return empCount;
	 
	 
 }
 public String getCompenyLocation() {
	 return compenyLocation;
	 
	 
 }
 public double getCompenyTurnover() {
	 return compenyTurnover;
	 
	 
 }
}

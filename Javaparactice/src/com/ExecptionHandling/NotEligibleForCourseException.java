package com.ExecptionHandling;
public class NotEligibleForCourseException extends Exception {
   String message;
   public NotEligibleForCourseException(String message){
	   
	   super(message);
	   
	   
   }
}

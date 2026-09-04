package com.Strings;

public class ReverseOfString {
	
	
	public static String reverseString(String myString) {
		
	   String reversedString="";

	   for(int i=myString.length()-1;i>=0;i--) {
		   
		   // System.out.println(i);
		   char currentChar=myString.charAt(i);
		   reversedString+=currentChar;
	   }
	 return reversedString;
	}

	public static void main(String[] args) {
		//avaJ is the expected output
		String myString="Java";
		
      String result=reverseString(myString);
      System.out.println(result);
	}

}

package com.Strings;


public class Methods {

	public static void main(String[] args) {
		
		String str1="java full stack";
		//length()
		System.out.println(str1.length());
		
		//charAt(0)
		System.out.println(str1.charAt(8));
		
		//equals()
		//System.out.println(str1.equals(""));
		
		//codePointCount()
		System.out.println(str1.codePointCount(0, 4));
		
		//contains()
		System.out.println(str1.contains("jav"));
		
		
        //starts with()
	    System.out.println(str1.startsWith("java"));
	    
	    //indexOf()
	    System.out.println(str1.indexOf('a'));
	    
	    //replace()
	    String str3=str1.replaceFirst("java", "python");
	    System.out.println(str3);
	
	    //trim()-removes leading and trailing spaces
	     String str="      java     ";
	     System.out.println(str);
	     System.out.println(str.trim());
	
	     //isEmpty()
	     //it returns the true if String is empty
	     //i.e if the length of a String zero
	     String s="";
	     System.out.println(s.length());
	     System.out.println(s.isEmpty());
	}

}

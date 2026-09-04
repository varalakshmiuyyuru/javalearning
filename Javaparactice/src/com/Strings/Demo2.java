package com.Strings;

public class Demo2 {

	public static void main(String[] args) {
	
		//string creation 
		String movie1="irumudi";
		String movie2="irumudi";
		String movie3="sita ramam";
		//== operator is reference comparison 
    	System.out.println("2 irumudi compared with == operator : ");
    	System.out.println(movie1==movie3);
    	System.out.println("2 irumudi campred with equals() method : ");
    	// equals()  is comparing the content 
		System.out.println(movie1.equals(movie2));
        System.out.println(" ");
        
        //string creation using new keyword
        System.out.println("string created using new keyword : ");
        System.out.println("====================================");
		String movie4=new String("ice age");
		String movie5=new String("ice age");
		
		//== operator is reference comparison 
		System.out.println("2 ice age compared with == operator : "+movie1==movie3);
		System.out.println(movie1==movie3);
		
		// equals()  is the content comparison 
		System.out.println("2 ice age  compared with equals() method : ");
		System.out.println(movie4.equals(movie5));

	}

}

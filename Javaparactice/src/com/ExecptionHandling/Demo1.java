package com.ExecptionHandling;

import java.io.File;

import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) {
		File f=new File("C:/java.txt");
	    try {
			f.createNewFile();
		
		} catch (IOException e) {
			System.out.println("file cant be created due to input or outupt problem");
			e.printStackTrace();
			
		}
		

	}

}

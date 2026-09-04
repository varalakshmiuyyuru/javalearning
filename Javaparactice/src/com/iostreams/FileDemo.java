package com.iostreams;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args)  {
		
		
		try {
	    File file =new File("jfs57.txt");
	    //to create a physical file use createNewFile()
		file.createNewFile();
		//exists() returns boolean true or false ,if file is exists returns true
		//if file dose not exist it returns false 
		System.out.println("Does the is file exists! "+file.exists());
		System.out.println(file.isFile());
		
		File directory=new File("jfs57directory");
		//mdir() is used to create the directory
		directory.mkdir();
		System.out.println("is directory exist ?"+directory.exists());
		System.out.println(directory.isDirectory());
	    }catch(IOException e) {
		e.printStackTrace();
	}

}
}

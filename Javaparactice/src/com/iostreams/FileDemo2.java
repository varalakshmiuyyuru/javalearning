package com.iostreams;
import java.io.File;
import java.io.IOException;

public class FileDemo2 {

	public static void main(String[] args) {
		try {
		//create a directory
		
		File dir=new File("My Notes");
		dir.mkdir();
		
		//File  (File file,"name of the file")
          File f1=new File(dir,"Arrys.txt");
          f1.createNewFile();
          File f2=new File(dir,"Exceptions.txt");
          f2.createNewFile();
          File f3=new File(dir,"control flow.txt");
          f3.createNewFile();
          
          //list outing the names of list 
          String[] fileNames=dir.list();
          
          //enhanced for loop
          for( String fileName :fileNames) {
        	  System.out.println(fileName);
          }
          
          System.out.println("files created ");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}

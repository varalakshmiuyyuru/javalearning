package com.iostreams;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		File f1=new File("myFile.txt");
		//file writer is class which is used to 
		//FileWriter writer=new FileWriter(file);
		
		
     try {
    	 
    	 FileWriter writer=new FileWriter(f1);
    	 writer.write("java progarmming lanuage");
         writer.write("\nfull stsck java development");
         
    	 char[] charArray= {'a','e','i','o','u'};
    	 writer.write("\n");
    	 writer.write(charArray);
         
         writer.flush();
         
     }catch(IOException e) {
    	 System.out.println("please make sure the file exist");
    	 e.printStackTrace();
     }
	}

}

package com.iostreams;

import java.io.FileReader;
import java.io.IOException;

public class FileRederDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileReader reader=new FileReader("myFile.txt")){
			System.out.println("Reading content of myFile.txt");
			int character;
			//System.out.println(reader.read());
			while((character =reader.read())!=-1) {
				System.out.print((char)character);
				
			}
		}catch(IOException e) {
			e.printStackTrace();
			
		}

	}

}

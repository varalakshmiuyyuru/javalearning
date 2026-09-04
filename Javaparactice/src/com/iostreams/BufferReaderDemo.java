package com.iostreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {

	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new FileReader("output.txt"))){
			System.out.println("Reading the file line by line");
	         String line;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}

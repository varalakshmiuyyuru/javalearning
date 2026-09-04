package com.iostreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo {

	public static void main(String[] args) {
		try(BufferedWriter bw=new BufferedWriter(new FileWriter("output.txt"))){
			bw.write("hello codegnan");
			bw.newLine();
			bw.write("Buffer Writer is faster for largs text files ");
			bw.flush();
			System.out.println("Data is written sucsessfully to output.txt");
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}

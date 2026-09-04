package com.corejava.threads;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
	
		for(int i=1;i<=5;i++) {
			//file downloading
			System.out.println("Downloading file "+i);
			Thread.sleep(500);
		}
		for(int i=1;i<=5;i++) {
			System.out.println("User is working.. "+i);
			Thread.sleep(500);
		}

	}

	
}

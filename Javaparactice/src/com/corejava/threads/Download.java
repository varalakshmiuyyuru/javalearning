package com.corejava.threads;


public class Download extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Downloading file "+i);
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for(int i=1;i<=5;i++) {
			System.out.println("USer is working.."+i);
		}
	}
}
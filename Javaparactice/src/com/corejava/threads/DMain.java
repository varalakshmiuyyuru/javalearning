package com.corejava.threads;

public class DMain {
//without join
	public static void main(String[] args) {
	
		DownloadTask d=new DownloadTask();
		d.start();
	
		Thread.currentThread().setName("main thread");
		System.out.println(Thread.currentThread().getName()+" processing Downloaded file");

	}

}

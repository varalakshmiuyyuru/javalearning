package com.corejava.threads;

public class WithJoin {

	public static void main(String[] args) {
		DownloadTask d=new DownloadTask();
		d.start();
		try {
			d.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
			
		}

		Thread.currentThread().setName("main thread");
		System.out.println(Thread.currentThread().getName()+" processing Downloaded file");

	}

}

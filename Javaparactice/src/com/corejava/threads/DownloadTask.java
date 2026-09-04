package com.corejava.threads;

public class DownloadTask extends Thread{

//	public static void main(String[] args) {
//		for(int i=1;i<=5;i++) {
//			System.out.println("downloading file"+i);
//			
//		}
//		
   @Override
   public void run() {
	   Thread.currentThread().setName("download Thread");
	   System.out.println(Thread.currentThread().getName()+" is downloading");
	   try {
		   Thread.sleep(1000);
		   
	   }catch(InterruptedException e) {
		   e.printStackTrace();
	   }
	   System.out.println(Thread.currentThread().getName()+" downlaoding finished");
   }
	}



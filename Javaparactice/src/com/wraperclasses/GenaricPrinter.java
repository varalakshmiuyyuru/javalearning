package com.wraperclasses;

public class GenaricPrinter <T>{
	T t;
	GenaricPrinter (T t){
		this.t=t;
	}
	public void printer() {
		System.out.println(t);
	}

}

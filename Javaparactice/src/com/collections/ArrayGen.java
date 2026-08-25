package com.collections;

import java.util.Vector;

public class ArrayGen {

	public static void main(String[] args) {
		
		Vector al=new Vector();
		System.out.println("initial capacity : "+al.capacity());
		System.out.println("initial size : "+al.size());
		al.add("Bahubali");
		al.add("devasena");
		al.add(null);
		al.add(true);
		al.add(58.09);
		al.add(new Integer(548));
		al.add('g');
		al.add("ramesh");
		al.add("suresh");
		al.add("rajesh");
		al.add("11 th value");
		System.out.println("final capacity :" + al.capacity());
		System.out.println("final size : "+al.size());
		System.out.println(al);
	}

}

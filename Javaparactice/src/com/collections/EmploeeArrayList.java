package com.collections;

import java.util.ArrayList;

public class EmploeeArrayList {
		
		public static void main(String[]args) {
			ArrayList<Employee> al=new ArrayList<>();
			al.add(new Employee(123,"Kalpana"));
			al.add(new Employee(234,"varalakshmi"));
			al.add(new Employee(125,"sivakumari"));
			for (Employee e:al)	{
				System.out.println(e.getEmpid()+" "+e.getempName());
				}
		}
	}
	
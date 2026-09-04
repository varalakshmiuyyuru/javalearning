package com.inheritance.casting;

public class ObjectCasting {
public static void  performWork(Employee employee) {
	employee.work();
}
	
	public static void main(String[] args) {
//		Developer developer=new Developer("ravi");
//		developer.work();
//	    developer.writingCode();
//	    ApplicationTesters at=new ApplicationTesters("Ravi");
//	    at.work();
//	    at.testApplication();
//	    Manager m=new Manager("Ravi");
//	    m.work();
//	    m.meeting();
//      Employee emp1=new Developer("Ravi");
//      emp1.work();
//      Employee emp2=new ApplicationTesters("balu");
//      emp2.work();
//      Employee emp3=new Manager("meena");
//      emp3.work();
     
     performWork(new Developer("Peddi"));
     performWork(new ApplicationTesters("Chekri"));
     performWork(new Manager("Kesava"));
      
     
     Employee emp4=new ApplicationTesters("Kanna");
     ApplicationTesters tester=(ApplicationTesters)emp4;
     tester.testApplication();
     
     Employee emp5=new Manager("Mahalakshmi");
     // to avoid the classCastingexecption we use the instanceof 
     if(emp5 instanceof Manager)
     {
     Manager manager=(Manager)emp5;
     manager.meeting();
	}
	}

}

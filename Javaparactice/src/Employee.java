

	public class Employee extends Person{
		int salary=35000;
		
	
	public void getSalary(int salary) {
		salary=20000;
		System.out.println(salary);//local
		System.out.println(this.salary);//global
	}
	public static void main(String[]args) {
		 Employee s=new  Employee() ;
			s.getSalary(100000);
	
	}
	}
	class Person{
		int salary=60000;
		public void getSalary(int salary) {
			salary=50000;
			System.out.println("parent Salary is : "+salary);
			System.out.println("parent class global salary : "+this.salary);
		}
	
	}

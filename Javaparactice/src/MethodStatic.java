import java.util.Scanner;

public class MethodStatic {
	//program demonstrating Recursion
	public static void print1toN(int num) {
		
         //base condition
		if(num==0) {
			return;
		}
		//recursive call
		print1toN(num-1);
		//this statement is never execute the because print1toN method is not comlpited
		//it will execute when itaretion is equal to num .
		//it follows lifo mothod last in first out
		System.out.println("  "+num);
	    }

	    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("enter the n : ");
		int num=sc.nextInt();
		System.out.println("numbers from 1 to " +num);
		print1toN(num);
        sc.close();
	}

}

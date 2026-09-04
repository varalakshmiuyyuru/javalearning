import java.util.Scanner;

public class FibanacciSeries {
  
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of terms:");
	int n=sc.nextInt();
	 int num1 = 0;
     int num2 = 1;

     for (int i = 1; i <= n; i++) {
         System.out.print(num1 + " ");

         int next = num1 + num2;
         num1 = num2;
         num2 = next;
     }
   sc.close();
	}

}

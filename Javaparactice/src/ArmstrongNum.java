import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number : ");
		int n=sc.nextInt();
		int org=n;
         int count=0;
         int sum=0;
         //count  digits in given number
         
         int temp = n;
         while (temp > 0) {
             count++;
             temp = temp / 10;
         }

         // Reset temp
         temp = n;

         // Calculate Armstrong sum
         while (temp > 0) {
             int digit = temp % 10;

             int power = 1;
             for (int i = 1; i <= count; i++) {
                 power = power * digit;
             }
             sum = sum + power;
             temp = temp / 10;
        
         }
         // Check Armstrong Number
         if (sum == org) {
             System.out.println(org + " is an Armstrong Number.");
         } else {
             System.out.println(org+ " is Not an Armstrong Number.");
         }

         sc.close();
         
	}

}

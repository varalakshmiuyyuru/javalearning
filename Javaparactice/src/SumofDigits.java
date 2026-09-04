import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number :");
		int num=sc.nextInt();
		int count=0;
		int sum=0;
		if(num==0) {
			count=1;
			
		}else {
			while(num>0) {
				count++;
				int digit = num % 10; // Get last digit
	            sum = sum + digit;  // Add digit to sum
	            num = num / 10; 
			}
			
		}
		System.out.println("sum og digits :"+sum);
		System.out.println("number of digits :"+count);
		sc.close();
	}

}

import java.util.Scanner;

public class PerfectNumber {
//1+2+3=6       1*2*3=6
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number : ");
		int n=sc.nextInt();
		int sum=0;
		//Check all possible proper divisors from 1 to n/2
		for(int i=1;i<=n/2;i++) {
			//if i is a divisor of n
			if(n % i == 0) {
				//increasing sum value until we get given number
				sum=sum+i;
				
			}
			
		}
		//if sum is eqal to given number we print the if statement
		if(sum==n) {
			System.out.println(n+" is perfect number ");
			
		}else {
			System.out.println(n+"is not a perfect number ");
		}
		sc.close();
	}

}

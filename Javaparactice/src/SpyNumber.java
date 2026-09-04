import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int sum=0;
		int product=1;
		int temp=num;
		while (temp>0) {
			int digit = temp % 10;
            sum = sum + digit;
            product = product * digit;
            temp = temp / 10;
			
		}
		if(sum==product) {
			System.out.println(num +"is SPY number");
		}else {
			System.out.println(num+"is not SPY number");
		}

	}

}

import java.util.Scanner;

public class ReverseAnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int num=sc.nextInt();
		int temp=0;
		while(num>0) {
			int digit=num%10;
			temp=temp*10+digit;
			num=num/10;
		}
		System.out.println("reverse of number :"+temp);	

	}

}

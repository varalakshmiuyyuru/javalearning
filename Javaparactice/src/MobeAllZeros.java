import java.util.Scanner;

public class MobeAllZeros {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array :");
		int n=sc.nextInt();
		System.out.println("enter elements of arry : ");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int index=0;
		
				for (int i=0;i<n;i++) {
					if(arr[i]!=0) {
						arr[index++]=arr[i];
					
					}
				   }
				while(index<n) {
					arr[index++]=0;
				}
			System.out.println("output");
			for(int i=0;i<n;i++) {
				System.out.println(arr[i]+" ");
			}
		
		
	}
}

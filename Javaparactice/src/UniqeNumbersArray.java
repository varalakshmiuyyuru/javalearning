import java.util.Scanner;

public class UniqeNumbersArray {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size: ");
		int n=sc.nextInt();
		System.out.println("enter array :");
		int[] arr=new int[n];
		int count=0;
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();	
		}
		System.out.println("Unique elements : ");
		for(int i=0;i<n;i++) {
			count=0;
			for(int j=i;j<n;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count==1) {
				System.out.print(arr[i]+" ");
			}
		}
		
		sc.close();
	}

}

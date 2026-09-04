import java.util.Scanner;

public class MergeTwoArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("enter size if array 1: ");
//		int n1=sc.nextInt();
//		System.out.println("enter elements of array 1: ");
//		int[]arr1=new int[n1];
//		for(int i=0;i<n1;i++) {
//			arr1[i]=sc.nextInt();
//			
//		}
//		System.out.println("enter size if array 2: ");
//		int n2=sc.nextInt();
//		System.out.println("enter elements of array 2: ");
//		int[]arr2=new int[n2];
//		for(int i=0;i<n2;i++) {
//			arr2[i]=sc.nextInt();
//			
//		}
//		int[] arr3=new int[n1+n2];
//		System.out.println("merged array : ");
//		for(int i=0;i<(n1+n2);i++) {
//			arr3[i]=arr1.length+arr2.length;
//			System.out.print(arr3[i]+" ");
//		}
		System.out.println("enter size if array 1: ");
  		int n1=sc.nextInt();
		System.out.println("enter size if array 2: ");
      	int n2=sc.nextInt();
      	int n3=n1+n2;
      	int arr1[]=new int[n1];
    	int arr2[]=new int[n2];
    	int arr3[]=new int[n1+n2];
      	System.out.println("enter elements of array 1: ");
		
		for(int i=0;i<n1;i++) {
		arr1[i]=sc.nextInt();
		arr3[i]=arr1[i];
		
	    }
        System.out.println("enter elements of array 2: ");
		
		for(int i=0;i<n2;i++) {
		arr2[i]=sc.nextInt();
		arr3[n1+i]=arr2[i];
		
	    }
		System.out.println("Merged array :");
		for(int i=0;i<(n1+n2);i++) {
		System.out.print(arr3[i]+" "); 
		}
		
		
      sc.close();
	}

}

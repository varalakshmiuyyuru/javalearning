import java.util.Scanner;

public class UnionArrays {

	public static void main(String[] args) {
		int[] a1= {1,2,3,4};
		int[] a2= {9,8,7,6};
		for (int i=0;i<a1.length;i++) {
			System.out.print(a1[i]+" ");
			}
			for(int j=0;j<a2.length;j++) {
				System.out.print(a2[j]+" ");
			}
			System.out.println();
		
//		int[] union=new int[a1.length+a2.length];
//		int k=0;
//		for(int i=0;i<a1.length;i++) {
//			union[k]=a1[i];
//			k++;
//			
//		}
//		for(int i=0;i<a2.length;i++) {
//			boolean found=false;
//			
//			for(int j=0;j<a1.length;j++ ) {
//				if(a2[i]==a1[j]) {
//					found =true;
//					
//					
//				}
//			}
//			if(!found) {
//				union[k]=a2[i];
//				k++;
//				
//			}
//			
//		}
//		System.out.println("union");
//		for(int i=0;i<k;i++) {
//			System.out.print(union[i]+" ");
//			
//		}
//		
//		
	}
	

}

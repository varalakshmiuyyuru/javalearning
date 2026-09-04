import java.util.Scanner;

public class MoveAllPositveNums {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter size of array : ");
		int n=sc.nextInt();
        System.out.println("Enter elements in aray : ");
        int[] arr=new  int[n];
        for(int i=0;i<n;i++) {
        	arr[i]=sc.nextInt();
        	
        }
       int index=0;
       for(int i=0;i<n;i++) {
    	   if(arr[i]!=0) {
    		   arr[index++]=arr[i];
    		   
    	   }
    	   
       }
       while(index<n) {
    	   arr[index++]=0;
       }
       System.out.println("result array : ");
       for(int i=0;i<n;i++) {
    	   System.out.print(arr[i]+"  ");
       }
       sc.close();
	}

}

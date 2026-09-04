import java.util.Scanner;

public class UniqueNumbers {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int[] arr= {1,2,3,4};
	int count=0;
     for(int i=0;i<arr.length;i++) {
    	 for (int j = 0; j < arr.length; j++) {
             for (int k = 0; k < arr.length; k++) {

                 if (i != j && j != k && i != k) {
                
                	    System.out.println(arr[i] + "" + arr[j] + "" + arr[k]);
                     count++;
                     
              }
                 
            }
    	     }
      } 
     System.out.println("digits count :"+count);
	}
}

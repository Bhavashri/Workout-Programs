package task;
import java.util.Scanner;
public class DuplicateArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the a value:");
      int a=sc.nextInt();
      System.out.println("enter the array elements:");
      int arr[]=new int [a];
      for(int i=0;i<arr.length;i++) {
    	  arr[i]=sc.nextInt();
      }
      int dup=0;
      for(int i=0;i<arr.length;i++) {
     	 for(int j=i+1;j<arr.length;j++) {
     		 if(arr[i]==arr[j])
     			dup++; 
     	 }
       } 
      int x=0;
      int arr1[]=new int[dup];
      for(int i=0;i<arr.length;i++) {
    	 for(int j=i+1;j<arr.length;j++) {
    		 if(arr[i]==arr[j])
    			arr1[x++]=arr[i]; 
    	 }
      }  
      System.out.println("the duplicate elements are:");
       for(int i=0;i<arr1.length;i++) {
    	   System.out.print(arr1[i]+" ");
 	}
  }
}

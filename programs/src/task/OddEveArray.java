package task;
import java.util.Scanner;
public class OddEveArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the number of elements:");
         int a=sc.nextInt();
         System.out.println("Enter the array elements:");
         int even=0;
         int odd=0;
         int arr[]= new int[a];
         for(int i=0;i<a;i++) {
        	 arr[i]=sc.nextInt();
         } 
         for(int i=0;i<arr.length;i++) {
        	 if(arr[i]%2==0) {
        		even++;
        	 }
        	 else {
        		 odd++;
        	 }
         }
         int arr1[]=new int[even];
    	 int arr2[]=new int[odd];
         int x=0,y=0 ;
         for(int i=0;i<arr.length;i++) {
        	 if(arr[i]%2!=0) {
				arr2[x++]=arr[i]; 
        	 }
        	 else {
        		 arr1[y++]=arr[i];
        	 }
         }
         System.out.println("even elements are:");
         for(int i=0;i<arr1.length;i++) {
         System.out.print(" "+arr1[i]);
         }
         System.out.println("\nodd elements are:");
         for(int i=0;i<arr2.length;i++) {
         System.out.print(" "+arr2[i]);
         }
}
}

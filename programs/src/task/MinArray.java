package task;
import java.util.Scanner;
public class MinArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the A value:");
   int a=sc.nextInt();
   System.out.println("enter the array value:");
   int arr[]= new int[a];
   for(int i=0;i<a;i++) {
	   arr[i]=sc.nextInt();
   }
   int min=arr[0];
   for(int i=0;i<arr.length;i++) {
	   if(arr[i]>min) {
		   min=arr[i];
	   }
   }
		   System.out.println("the min value is:"+min);
	   
   
	}

}

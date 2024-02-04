package class1_task;

import java.util.Scanner;
//to 
public class fibonnaciUsingFor_T2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=1;
		int n2=1;
		System.out.println("enter the n no.of add:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		arr[0]=1;
		arr[1]=1;
		System.out.print("arr[0] = "+arr[0]+" arr[1] = "+arr[1]);
		for(int i=2;i<n;i++) {
		 arr[i]=arr[i-1]+arr[i-2];
		System.out.print(" arr["+i+"]"+" = "+arr[i]);
  }
	}
}

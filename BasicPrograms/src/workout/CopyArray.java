package workout;
import java.util.Scanner;
public class CopyArray {
  public static void main(String[]args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the number of elements:");
	  int n= sc.nextInt();
	  int arr1[]=new int[n];
	  int arr2[]=new int[arr1.length];
	  System.out.println("enter the array element:");
	  // getting array element using scanner
	  for(int i=0;i<n;i++) {
		  arr1[i]=sc.nextInt();
	  }
	  for(int i=0;i<arr1.length;i++) {
		  arr2[i]=arr1[i];
	  }
	  System.out.println("orginal array elements:");
	  for(int i=0;i<arr1.length;i++) {
		  System.out.print(arr1[i]+" ");
	  }
	  System.out.println();
	  System.out.println("new array element:");
	  for(int i=0;i<arr2.length;i++) {
		  System.out.print(arr2[i]+" ");
	  }
  }
}

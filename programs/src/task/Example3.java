package task;
import java.util.Scanner;
public class Example3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print reverse array
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements:");
		int n=sc.nextInt();
	  int arr[]= new int[n];
	  System.out.println("enter the array elements:");
	  for(int i=0;i<n;i++) {
		  arr[i]=sc.nextInt();
	  }
      for (int i=arr.length-1;i>=0;i--){
 	  System.out.println(arr[i]); 
	   }
   }
}
// another method for reverse

/*int arr[]= {12,15,18,9,10,17};
System.out.println("enter the array elements:");
for(int i=0;i<arr.length;i++) {
	 int rev=arr.length-(i+1);
 System.out.println(arr[rev]); 
 }*/
package workout;
import java.util.Scanner;
public class Practice {
    public static void main(String[]args) {
    	//int n;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter the no of element of want to store:");
    	int n=sc.nextInt();
    	int arr[]=new int[10];
    	System.out.println("enter the element in array:");
    	for( int i=0;i<n;i++) {
    		arr[i]=sc.nextInt();
    	}
    	System.out.println("elements are:");
    	for( int i=0;i<n;i++) {
    		System.out.println(arr[i]);
    	}
    }
}

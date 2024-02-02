package workout;
import java.util.Scanner;
public class Practice1 {
	public static void num(int arr[],int n) {
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
				System.out.println(min);
			}
		}
	}
    public static void main(String []args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter the number of element:");
    	int n=sc.nextInt();
    	int arr[]=new int[10];
    	System.out.println("enter the array elements:");
    	for(int i=0;i<n;i++) {
    		arr[i]=sc.nextInt();
    	}
    	num(arr,n);
    }
}

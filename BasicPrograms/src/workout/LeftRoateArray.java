package workout;

public class LeftRoateArray {
public static void main(String[]args) {
	//int n;
	int arr[]= {1,3,4,5,6,7};
	for(int i=0;i<arr.length;i++) {
		int rev=arr.length-(i+1);
		System.out.print(arr[rev]+" ");
	}
 }
}

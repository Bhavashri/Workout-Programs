package task;
import java.util.Scanner;
public class OddEveAsc_Recu {
public static void main(String []args) {
	int arr[]= {65,22,87,5,4,11,54};
	even(arr,0);
	odd(arr,0);
	ascRecursive(arr,0,0);
	int arr1[]= even(arr,0);
	int arr2[]= odd(arr,0);
	System.out.println("\n*****************even elements*******************");
   print(ascRecursive(arr1, 0, 0));
   System.out.println("\n*****************odd elements*******************");
   print (ascRecursive(arr2, 0, 0));
}
public static void print(int arr[]) {
for(int i=0;i<arr.length;i++) {
	  System.out.println(arr[i]);
 }
}
public static int [] ascRecursive(int arr[],int i,int j) {
	if(j<arr.length-1) {
		j++;
	}
	else {
		j=0; i++;
	}
	if(i<arr.length) {
	if(arr[i]<arr[j]) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
		ascRecursive(arr,i,j);
}
	return arr;
}
public static int []even(int arr[],int i) {
	int even=0;
	for(i=0;i<arr.length;i++) {
		if(arr[i]%2==0) {
			even++;
		}
	}
	int arr1[]=new int[even];
	int x=0;
	for( i=0;i<arr.length;i++) {
		if(arr[i]%2==0) {
			arr1[x++]=arr[i];
		}
	}
	return arr1;
}
public static int []odd(int arr[],int i) {
	int odd=0;
	for(i=0;i<arr.length;i++) {
		if(arr[i]%2!=0) {
			odd++;
		}
	}
	int arr2[]=new int [odd];
	int x=0;
	for( i=0;i<arr.length;i++) {
		if(arr[i]%2!=0) {
			arr2[x++]=arr[i];
		}
	}
	return arr2;
}
}

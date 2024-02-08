package RecursiveFun_Day5;

public class RecursiveFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int arr[]= {8,7,6,5,9};
  System.out.println("*****************recursive elements*******************");
    recursive(arr,0);
    System.out.println("\n*****************revRecursive elements*******************");
    revRecursive(arr,arr.length-1);
    int arr1[]= ascRecursive(arr,0,0);
    int arr2[]= descRecursive(arr,0,0);
    System.out.println("\n*****************ascRecursive elements*******************");
    print(arr1);
    System.out.println("\n*****************descRecursive elements*******************");
    print(arr2);

	}
   public static int recursive (int arr[],int i) {
	   if(i<arr.length) {
		   System.out.print(arr[i]+" ");
		   
		   recursive(arr,++i);
	   }
	 return i;  
}
public static int revRecursive(int arr[],int i) {
	 if(i>=0) {
		   System.out.print(arr[i]+" ");
		   revRecursive (arr,--i);
	   }
	 return i;  
}
//ascending order
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
public static int [] descRecursive(int arr[],int i,int j) {
	if(j<arr.length-1) {
		j++;
	}
	else {
		j=0; i++;
	}
	if(i<arr.length) {
	if(arr[i]>arr[j]) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
		descRecursive(arr,i,j);
	}

	return arr;
}
}

package sorting;


public class TypesOfSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {21,9,16,18,17,2};
		System.out.println("**********************bobbleSort***************************");
		int arr1[]=bobbleSort(arr.clone());
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("**********************selectionSort***************************");
		int arr2[]=selectionSort(arr.clone());
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		System.out.println("**********************selectionSort***************************");
		int arr3[]=insertionSort(arr.clone());
		for(int i=0;i<arr3.length;i++) {
			System.out.println(arr3[i]);
		}
		System.out.println("**********************mergeSort***************************");
		
		mergeSort(arr,0,arr.length-1);  
		System.out.println("**********************mergeSort***************************");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
	
   public static int [] bobbleSort(int arr[]){
	   for(int i=0;i<arr.length-1;i++) {
		   for(int j=i+1;j<arr.length;j++) {
			   if(arr[i]>arr[j]) {
				   int temp=arr[i];
				   arr[i]=arr[j];
				   arr[j]=temp;
			   }
		   }
	   }
	   return arr;
   }
   
   public static int [] selectionSort(int arr[]) {
	   for(int i=0;i<arr.length-1;i++) {
		   int minIndex=i;
		   for(int j=i+1;j<arr.length;j++) {
			   if(arr[j]<arr[minIndex]) {
				   minIndex = j;
			   }
		   }
		   
		   int temp=arr[i];
		   arr[i]=arr[minIndex];
		   arr[minIndex]=temp;
	   
   }
	   return arr;
   }
   public static int [] insertionSort(int arr[]) {
	   for(int i=0;i<arr.length;i++) {
		   int currentVal=arr[i];
		   int j = i-1;
		   while(j>=0 && arr[j] > currentVal) {
			   arr[j+1] = arr[j];
			   j--;
		   }
		   arr[j+1] = currentVal;
	   }
	   return arr;
   }
   public static int[] mergeSort(int arr[],int start,int end) {
	   if(start<end) {
		   int mid=(end+start)/2;
		   int  [] rightFinal= mergeSort(arr,mid+1,end);
		   
		   int  [] leftFinal= mergeSort(arr,start,mid);
		   
			   System.out.println("method call "+start+":"+end);
			   merge(arr,start,mid,end);
		   }
	   return arr;
	   } 
   
	  public static void merge(int arr[],int start,int mid,int end) {
		  int n1=mid-start+1;
		  int n2=end-mid;
		  int startarr[]=new int[n1];
		  int endarr[]=new int[n2];
		  for(int i=0;i<n1;i++) {
			  startarr[i]=arr[start+i];
		  }
	  for(int i=0;i<n2;i++) {
		  endarr[i]=arr[mid+1+i];
	  }
	  int i=0;
	  int j=0;
	  int k=0;
	  while(i<n1 && j<n2) {
		  if(startarr[i] <= endarr[j]) {
			  arr[k]=startarr[i];
			  i++;
		  }
		  else {
			  arr[k]=endarr[j];
			  j++;
		  }
		  k++;
	  }
	  
	  while(i<n1) {
		  arr[k]=startarr[i];
		  i++;
		  k++;
	  }

	  while(i<n2) {
		  arr[k]=endarr[j];
		  j++;
		  k++;
	  }
    }  
  }
   


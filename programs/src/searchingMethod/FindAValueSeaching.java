package searchingMethod;

public class FindAValueSeaching {
public static void main(String []args) {
	int arr[]= {2,3,4,5,6,7,8,9,10,11,12,13,14,15,17,18,20};
	int n=15;
    print ("Linear", linearSearch(arr,n),n);
    System.out.println("*********************************************************");
    print("Binary", binarySearch(arr,n),n);
    System.out.println("*********************************************************");
    print("ternary", ternarySearch(arr,n),n);
    System.out.println("*********************************************************");
    print("ternaryRec", ternarySearchRec(0,arr.length-1,arr,n,-1),n);
    System.out.println("*********************************************************");
    print("binarySearchRec", binarySearchRec(arr,n,0,arr.length-1), n);
}

private static void print(String search,int res, int n) {
	if(res != -1)
		System.out.println(search+"Search: value :"+n+" index: " +res);
	else
		System.out.println(search+" search: :(");
}
private static int linearSearch(int []arr,int n) {
	int loopExcution=0;
	for(int i=0;i<arr.length;i++) {
		loopExcution++;
		if(arr[i]==n) {
			System.out.println("Linear search loop excution: "+loopExcution);
			return i;
		}
	}
	return -1;
}
private static int binarySearch(int []arr,int n) {
	int start =0;
	int end = arr.length-1;
	int loopExcution =0;
	
	while(start <= end) {
		loopExcution++;
		int mid = (end + start)/2;
		
		if(arr[mid]==n) {
			System.out.println("Binary search loop excution: "+loopExcution);
			return mid;
		}
		else if(arr[mid] < n) {
			start = mid + 1;
		}
		else if(arr[mid] > n) {
			end = mid - 1;
		}
	}
	System.out.println("Binary search loop excution: "+loopExcution);
	return -1;
}
 private static int ternarySearch(int arr[],int n) {
	int start=0;
	int end=arr.length-1;
	int loopExcution=0;
	
	while(start <= end) {
		loopExcution++;
		int mid1=start + (end - start)/3;
		int mid2=end - (end  - start)/3;
		if(arr[mid1] == n) {
			System.out.println("ternary search loop excution: "+loopExcution);
			return mid1;
		}
		if(arr[mid2] == n) {
			System.out.println("ternary search loop excution: "+loopExcution);
			return mid2;
		}
		 if(arr[mid1] > n) {
			end=mid1 - 1;
		}
		 else if(arr[mid2] < n) {
			start=mid2 + 1;
		}
		else {
			start=mid2 + 1;
			end=mid1 - 1;
		}
	}
   return -1;
}
private static int ternarySearchRec(int start,int end,int arr[],int n,int res) {
	if(start <= end) {
	int mid1=start + (end - start)/3;
	int mid2=end - (end  - start)/3;
	if(arr[mid1] == n) {
		res=mid1;
		return mid1;
	}
	if(arr[mid2] == n) {
		res=mid2;
		return mid2;
	}
	 if(arr[mid1] > n) {
		//end=mid1 - 1;
		res=ternarySearchRec(start, mid1-1,arr,n,res);
	}
	 else if(arr[mid2] < n) {
		 res=ternarySearchRec(mid2-1,end,arr,n,res);
	}
	
	else {
		res = ternarySearchRec(mid1+1 , end,arr,n,res);
	}
  }
return res;
}
private static int binarySearchRec(int []arr, int n, int start, int end) {
	int res=0;
	while(start <= end) {
		
		int mid = (end + start)/2;
		
		if(arr[mid]==n) {
			return mid;
		}
		else if(arr[mid] < n) {
			res=binarySearchRec(arr,n,mid+1,end);
			return res;
		}
		else if(arr[mid] > n) {
			res=binarySearchRec(arr,n,start,mid-1);
			return res;
		}
	}
	return res;
}
}

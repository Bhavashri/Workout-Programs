package LogicImplementation;

public class TwoPointerBitManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[]= {7,21,8,9,16,23};
     int n=17;
     System.out.println("27:"+twoPointer(arr,27));
     System.out.println("14:"+twoPointer(arr,14));
     System.out.println("16:"+twoPointer(arr,16));
     System.out.println("42:"+twoPointer(arr,42));
     System.out.println("39:"+twoPointer(arr,39));
	}
	
     public static boolean twoPointer(int arr[],int n) {
	     boolean val=false;
	     for(int i=0;i<arr.length;i++) {
	    	 for(int j=i+1;j<arr.length;j++) {
	    			 int ans=arr[i]+arr[j];
	    			 if(ans==n) {
	    			  val=true;
	    		 }    
	    	 }
	     }
	     return val;   
     } 
  }
	


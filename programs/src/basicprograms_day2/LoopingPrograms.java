package basicprograms_day2;
import java.util.Scanner;
public class LoopingPrograms {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int sum=0;
	        int arr[]= {21,19,17,18,109,200};
	        for(int i=0;i<arr.length;i++) {
	        sum	+=arr[i];    //sum+arr[0]
	        }
	        System.out.println(sum);
	        
	}
}*/
		
// while loop
         int arr[]= {8,3,21,56,13};
         int i=0;          //intialzation
         while(i<arr.length) { //condition
        	 int rev=arr.length-(i+1);  // reverse method
        	 System.out.println(arr[rev]);
	        i++;   //increment
         }
	}
}

package programs_day3;

public class ArrayWhileProgram {
public static void main(String []args) {
	 int arr[]= {8,9,21,19,16,19,29,36,34};
     int i=2;                          //intialzation
     while(i<arr.length) {             //condition                           
    	 System.out.println(arr[i]+":"+i);
        i=i+2;                        //increment
     }
}
}

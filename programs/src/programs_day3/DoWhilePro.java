package programs_day3;

public class DoWhilePro {
public static void main(String[]args) {  //main method or function 
	int arr[]= {12,23,4,5,65,78,21,9};
	int i=-1;
	do {
		i++;
		System.out.print(arr[i]+" ");
		
	}
	
	while(i<arr.length-1);//don't put bracket for while when it is "do while"
	}
}


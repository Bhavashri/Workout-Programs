package task;
import java.util.Scanner;
public class Example2 {
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	// print odd and even number
	switch(num%2) {
	case 0: // The value should be 1 or 0. So we put case name as 0 and 1
		System.out.println("even number");
		break;
	case 1:
		System.out.println("odd number");
		break;
	}
  }
}

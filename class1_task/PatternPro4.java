package class1_task;
import java.util.Scanner;
public class PatternPro4 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the a value:");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++) {
           for(int j=a;j>=1;j--) {
			if(i>=j)
			System.out.print(j);
			else
		System.out.print(" ");
	}
		System.out.println();
     }
	}
}

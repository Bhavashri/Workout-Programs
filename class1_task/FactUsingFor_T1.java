package class1_task;
import java.util.Scanner;
public class FactUsingFor_T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n value:");
		int n=sc.nextInt();
		int fact=1;
		
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
         System.out.println("the factorial of "+n+":"+fact);
	}
}


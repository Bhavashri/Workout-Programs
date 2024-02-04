package class1_task;

import java.util.Scanner;

public class FiboUsingDoWhile_T2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=1;
		int n2=1;
		System.out.println("enter the total no.of add:");
		int total=sc.nextInt();
		int n3=0;
		System.out.print(n1+" "+n2);
		int i=2;
		do {
			n3=n1+n2;
	         System.out.print(" "+n3);
	         n1=n2;
	         n2=n3;
	         i++;
		}
		while(i<total);
}
}

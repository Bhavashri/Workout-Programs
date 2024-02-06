package class1_task;
import java.util.Scanner;
public class PattenPro2 {
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of element:");
	int a=sc.nextInt();
	if(a%2!=0) {
		int x=(a/2);
		int y=(a/2);
		boolean rev=true;
		for(int i=0;i<a;i++) {
			for(int j=0;j<a;j++) {
				if(x==j||y==j) {
					System.out.print("*");
				}
				else {
					System.out.print(".");
				}
			}
			if(x==0) {
				rev=false;
			}
			if(rev) {
				x--;
				y++;
			}
			else {
				x++;
				y--;
			}
			System.out.println("");
		}
	}
	else {
		System.out.println("enter odd number");
	}
}
}

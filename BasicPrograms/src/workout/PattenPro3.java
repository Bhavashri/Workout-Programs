package class1_task;
import java.util.Scanner;
public class PattenPro3 {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the a value:");
	int a=sc.nextInt();
	for(int i=1;i<=a;i++) {
		for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			
				System.out.println("");
			}
}
}

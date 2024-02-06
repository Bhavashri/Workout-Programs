package class1_task;
import java.util.Scanner;
public class PattenPro1 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String a=sc.next();
		String b="";
		
		System.out.println(a.length());
		for(int i=a.length()-1;i>=0;i--) {
			for(int j=0;j<a.length();j++) {
				if(i==j) {
					System.out.print(a.charAt(i));
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
}

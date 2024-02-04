package workout;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String args[]){ 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n value:");
		 int sum=0,rem,temp; 
		 int n=sc.nextInt();
		 temp=n;
		 while(n>0) {
			 rem=n%10;
			 sum=(sum*10)+rem;
			 n=n/10;
		 }
		 if(temp==sum) {
		 System.out.println("palindrome");
		 }
		 else {
			 System.out.println("not a palindrome");
		 }
		}  
}


package task;
import java.util.Scanner;
public class Example1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		// (a%2==1),(a%2!=0),(!(a%2!=1)),(!(a%2==0))-->odd 
		// (a%2==0),(a%2!=1),(!(a%2!=0)),(!(a%2==1))-->even
    if(!(a%2!=1)) {  
    	System.out.println("odd number");
	}
    else {
		System.out.println("even number");
	}
  }
}



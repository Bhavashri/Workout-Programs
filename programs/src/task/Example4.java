package task;
import java.util.Scanner;
public class Example4 {
   public static void main(String[]args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the n1 value:");
	   int n1=sc.nextInt();
	   System.out.println("enter the n2 value:");
	   int n2=sc.nextInt();
	   System.out.println("enter the operator :");
	   char operator=sc.next().charAt(0);
	   int result=0;
	   ArithExample4 arith=new ArithExample4();
	   switch(operator) {
	   case '+': 
		   result=arith.add(n1,n2);
	   System.out.println(n1+" "+operator+" "+n2+" = "+result);
	   break;
	   
	   case '-': 
		   result=arith.sub(n1,n2);
	   System.out.println(n1+" "+operator+" "+n2+" = "+result);
	   break;
	   
	   case '*': 
		   result=arith.multiple(n1,n2);
	   System.out.println(n1+" "+operator+" "+n2+" = "+result);
	   break;
	   
	   case '/': 
		   result=arith.division(n1,n2);
	   System.out.println(n1+" "+operator+" "+n2+" = "+result);
	   break;
	   
	   case '%': 
		   result=arith.modulo(n1,n2);
	   System.out.println(n1+" "+operator+" "+n2+" = "+result);
	   break;
	   
	   default:
		   System.out.println("it is not arthimatic");
	   }
	   
   }
}

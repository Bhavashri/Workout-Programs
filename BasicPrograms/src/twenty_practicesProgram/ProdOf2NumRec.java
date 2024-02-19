package twenty_practicesProgram;
import java.util.Scanner;   
public class ProdOf2NumRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[2];
		 Scanner s = new Scanner(System.in);
		 System.out.print("Enter the first number:");
		 a[0] = s.nextInt();
		 System.out.print("Enter the second number:");
		 a[1] = s.nextInt();
		 ProdOf2NumRec obj = new ProdOf2NumRec();
		 int mul = obj.multiply(a,0);
		 System.out.println("Answer:"+mul);
		 }
		 int multiply(int x[], int i)
		 {
		 if(i < 2)
		 {
		 return x[i] * multiply(x, ++i);
		 }
		 else
		 {
		 return 1;
		 }

	}

}

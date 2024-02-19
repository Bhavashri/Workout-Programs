package twenty_practicesProgram;
import java.util.Scanner;
public class MulBitwiseOper {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		 Scanner s = new Scanner(System.in);
		 System.out.print("Enter the number:");
		 n = s.nextInt();
		 mulBitwise(n);
	}
	public static void mulBitwise(int n) {
		 int mul = n << 2;
		 System.out.println("Answer:"+mul);
	}
	
	
}

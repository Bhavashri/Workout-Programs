package twenty_practicesProgram;
import static java.lang.StrictMath.pow;
import java.util.Scanner;
public class Reverse_numRec {
	public static void main(String[] args)
	 {
	 int n, count = 0, m;
	 Scanner s = new Scanner(System.in);
	 System.out.print("Enter the number:");
	 n = s.nextInt();
	 m = n;
	 while(m > 0)
	 {
	 count++;
	 m = m / 10;
	 }
	 Reverse_numRec obj = new Reverse_numRec();
	 int a = obj.reverse(n, count);
	 System.out.println("Reverse:"+a);
	 }
	 int reverse(int x, int length)
	 {
	 if(length == 1)
	 {
	 return x;
	 }
	 else
	 {
	 int b = x % 10;
	 x = x / 10;
	 return (int) ((b * pow(10, length - 1)) + reverse(x, --length));
	 }
	 }
	
}

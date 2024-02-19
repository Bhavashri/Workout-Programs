package twenty_practicesProgram;
import java.util.Scanner;
public class Count_No_bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, m, count = 0;
		 String x = "";
		 Scanner s = new Scanner(System.in);
		 System.out.print("Enter the Decimal Number:");
		 n = s.nextInt();
		 while(n > 0)
		 {
		 int a = n % 2;
		 x = a + x;
		 n = n / 2;
		 }
		 int l = x.length();
		 for(int i = 0; i < l; i++)
		 {
		 if(x.charAt(i) == '1')
		 {
		 count++;
		 }
	}
		 System.out.println("No. of 1's are:"+count);
	}
}

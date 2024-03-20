package mathPro;

import java.util.Random;

public class MathExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a=-23;
		Integer b=317;
		Double c=37.5;
		Double d=22.3;
		Double e=31.6;
		int arr[]= {2,17,13,113,119};
		
		
		int sum=0;
		System.out.println("Absolute : "+Math.abs(a));
		System.out.println("Absolute : "+Math.abs(c));
		System.out.println("ceil : "+Math.ceil(c));
		System.out.println("floor : "+Math.floor(c));
		System.out.println("round : "+Math.round(c));
		System.out.println("round : "+Math.round(d));
		System.out.println("sqrt: "+Math.sqrt(a));
		System.out.println("max : "+Math.max(c, a));
		System.out.println("min : "+Math.min(a,d));
		System.out.println("Multiple : "+Math.multiplyFull(a,b));
		System.out.println("random : "+Math.random());
		System.out.println("Power of : "+Math.pow(21,3));
		System.out.println("power of : "+Math.exp(d));
		
		Random r= new Random();
		System.out.println("Random for Double: "+r.nextDouble(91.4, 99.0));
		System.out.println("Random for Int : "+r.nextInt(91, 99));
		
		//String static method
		String.join("Hello","world");
		System.out.println("******************************************************************");
		System.out.println("Absolute : "+Math.abs(a));
		System.out.println("*******************************************************************");
		int E=(int)Math.floor((e));
		sum=(int) (c+d+E);
		int res=sum+99;
		System.out.println(res);
		System.out.println("**********************************************************************");
		System.out.println(Math.negateExact(b));
		System.out.println("**********************************************************************");
		System.out.println(Math.sqrt(121)+" : "+Math.sqrt(64));
		System.out.println("**********************************************************************");
		System.out.println("prime number is: "+isPrime(71));
		System.out.println("**********************************************************************");
		System.out.println("The greatest common factors are: "+findGcf(1280,720));
	}
		
		public static boolean isPrime(Integer num) {
			if(num<=1) {
				return false;
			}
			for(int i=2;i<=Math.sqrt(num);i++) {
				if(num%i==0)
					return false;
			}
			return true;
	}
		public static int findGcf(int x,int y) {
			while(y!=0) {
				int temp=y;
				y=x%y;
				x=temp;
			}
			return x;
		}
}

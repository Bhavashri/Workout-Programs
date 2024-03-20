package string;

public class StringRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello World All";
		String m="hello world";
		logic(str);
		System.out.println("*******************************************************************");
		method(m);
	}
	
	public static void logic(String s) {
		String [] sArr = s.split(" ");
		
		for(int i=0;i<sArr.length;i++) {
			for(int j=0;j<sArr.length-i;j++) {
				System.out.print(" "+sArr[i]);
			}
			System.out.println();
		}
	}
	public static void method(String m) {
		System.out.println(m.replace("world", "All"));
		System.out.println("*******************************************************************");
		String [] mArr = m.split(" ");
		for(int i=mArr.length-1;i>=0;i--) {
			
				System.out.print(mArr[i]+" ");
			
			}
		System.out.println("\n*******************************************************************");
		System.out.println(m.replace(" ", "__"));
		char [] mArr1 = m.toCharArray();
		System.out.println("*******************************************************************");
		for(int i=0;i<mArr1.length;i++) {
			if(i%2==0) {
			System.out.print("-"+mArr1[i]);
			}
			else {
				System.out.print("*"+mArr1[i]);
			}
		}
	}
}
 
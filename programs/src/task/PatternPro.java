package task;

public class PatternPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println(hallowSqu(5,0,0));
	}
	public static int hallowSqu(int n,int i,int j) {
		if(n<=0) {
			return -1;
		}
		if(i<n){
			if(j<n) {
				if(i==0||j==0||j==n-1||j==n-1) {
					System.out.print("* ");
				}
				j++;
				System.out.print("  ");
			}
			System.out.println(" ");
			i++;
		}
		hallowSqu(n-1,i,j);
	return 0;
}
}

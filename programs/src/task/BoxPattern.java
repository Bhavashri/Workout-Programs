package task;

public class BoxPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		for(int row=0;row<n;row++) {
			for(int col=0;col<n;col++) {
				if(row==0||row==n-1||col==0||col==n-1||row==col||row+col==n-1) {
					
					System.out.print("* ");
				}
				else {
					System.out.print ("  ");
				}
			}
			System.out.println("");
		}
	}


}

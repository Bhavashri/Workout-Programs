package task;

public class YPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern(5,0,0);
	}
	public static int pattern(int n,int row,int col) {
		int res = 0;
		if(row<n) {
			if(col<n) {
				int mid=n/2;
				if(row==col&&mid>=row&&mid>=col || col==mid&&mid<=row&&mid<=col || row+col==n-1 && mid>row) {
				System.out.print("*");
				}
				res=pattern(n,row,col+1);
				System.out.print(" ");
				
			}
			res=pattern(n,row+1,col);
			System.out.println();
			
		}
		return res;
	}

}

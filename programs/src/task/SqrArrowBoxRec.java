package task;

public class SqrArrowBoxRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		
		System.out.println("************************Square*****************************");
		square(n);
		System.out.println("*************************Arrow*****************************");
		arrow(n);
		System.out.println("**************************Box*********************************");
		box(n);
		System.out.println("***********************SquareRec*****************************");
		squareRec(n,0,0);
		System.out.println("***********************ArrowRec*****************************");
		arrowRec(n,0,0);
		System.out.println("************************BoxRec*****************************");
		boxRec(n,0,0);
		System.out.println("************************SquareTri*****************************");
		SquareTri(n);	
	}
	
	public static void square(int n) {
				int row=0;
				while(row<n) {
				int col=0;
				while(col<n) {
				if(row==0||row==n-1||col==0||col==n-1) {
					
					System.out.print("* ");
				}
				else {
					System.out.print ("  ");
				}
				col++;
			}
			System.out.println("");
			row++;
		}
   }
	
	public static void arrow(int n) {
		int row=0;
		while(row<n) {
		int col=0;
		while (col<n) {
			if(row==0 || row+col==n-1 || col==n-1 ) {
				System.out.print("* ");
			}
			else {
				System.out.print ("  ");
			}
			col++;
		}
		System.out.println("");
		row++;
		}
	}
	
	public static void box(int n) {
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
	
       public static int squareRec(int n,int row,int col) {
				int res = 0;
				if(row<n) {
				    if(col<n) {
					if(row==0||row==n-1||col==0||col==n-1) {
						System.out.print("* ");
					}
					else {
						System.out.print ("  ");
					}
					   res = squareRec(n,row,col+1);
					   return res;
				}
			   System.out.println("");
			   res = squareRec(n,row + 1,0);
			   return res;
		   }
			return res;
		}
       
 public static int arrowRec(int n,int row,int col) {
    	int res=0;
   		if(row<n) {
   		if(col<n) {
   			if(row==n-1 || row+col==n-1 || col==0 ) {
   				System.out.print("* ");
   			}
   			else {
   				System.out.print ("  ");
   			}
   			res=arrowRec(n,row,col+1);
   			return res;
   		}
   		System.out.println("");
   		res=arrowRec(n,row+1,0);
   		return res; 
   		}
   		return res;
   	}
       
       public static int boxRec(int n,int row,int col) {
    	   int res=0;
    		if(row<n) {
    			if(col<n) {
    				if(row==0||row==n-1||col==0||col==n-1||row==col||row+col==n-1) {
    					System.out.print("* ");
    				}
    				else {
    					System.out.print ("  ");
    				}
    				res=boxRec(n,row,col+1);
    				return res;
    			}
    			System.out.println("");
    			res=boxRec(n,row+1,0);
    			return res;
    		}
    		return res;
    	}
       public static void SquareTri(int n) {
			int row=0;
			while(row<n) {
			int col=0;
			while(col<n) {
				int mid=n/2;
				int upper=(row*0)+1;
				int lower=(row*0)+n-2;
			if(row==0||row==n-1||col==0||col==n-1||row==mid||
					row%2!=0&&col%2!=0&&upper==row||col%2!=0&&lower==row) {
				
				System.out.print("* ");
			}
			else {
				System.out.print ("  ");
			}
			col++;
		}
		System.out.println("");
		row++;
	}
       }            
    	  
	}



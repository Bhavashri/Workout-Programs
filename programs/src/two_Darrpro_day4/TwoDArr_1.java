package two_Darrpro_day4;

public class TwoDArr_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr[][]= new int[][]{{2,3,4},{9,6,5},{6,4,8},{9,1,7}};
  System.out.println("********************** 2D Array ***********************");
  list(arr);
  System.out.println("******************** Row reverse 2D Array*****************");
  rowReverse(arr);
  System.out.println("******************** columnn & row reverse 2D Array*****************");
  columnRowReverse(arr);
   }
	public static void list(int [][]arr) {
		 for(int i=0;i<arr.length;i++) {
			   int []val=arr[i];
			   for(int j=0;j<val.length;j++) {
				   System.out.print(val[j]+" ");
			   }
			   System.out.println();
		   }
	}
	public static void rowReverse(int [][]arr) {
		 for(int i=arr.length-1;i>=0;i--) {
		   int []row=arr[i];
		   for(int j=0;j<row.length;j++) {
			   System.out.print(row[j]+" ");
		   }
		   System.out.println();
	   }
	}
	public static void columnRowReverse(int [][]arr) {
		 for(int i=arr.length-1;i>=0;i--) {
		   int []row=arr[i];
		   for(int j=row.length-1;j>=0;j--) {
			   System.out.print(row[j]+" ");
		   }
		   System.out.println();
	   }
	}
}

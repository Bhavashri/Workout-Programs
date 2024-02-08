package two_Darrpro_day4;

public class TwoDArry_Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= new int[][]{{2,3,4},{9,6,5},{6,4,8},{9,1,7}};
		// to reverse row
		   for(int i=arr.length-1;i>=0;i--) {
			   int []val=arr[i];
			   // to reverse column  
			   for(int j=val.length-1;j>=0;j--) {
				   System.out.print(val[j]+" ");
			   }
			   System.out.println();
		   }
	}
	

}

package programs_day3;

public class FunctionOrMethods {
public static void main(String[]args) {
	int arr[]= {15,19,23,65,3,123};
	int total=0;
	Arithmatic arit=new Arithmatic();
	for(int i=0;i<arr.length;i++) {
		System.out.println(i+":"+arr[i]);
		total=arit.add(total, arr[i]);
	}
	System.out.println("total:"+total);
}
}

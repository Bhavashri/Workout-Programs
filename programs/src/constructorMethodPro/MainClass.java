package constructorMethodPro;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum sum=new Sum(3,6);
		sum.add(2,4);
		
		int ans = (int) sum.add(2, 4);// normal method(objectname.methodname)
		float ans1 = Sum.addFloat(6.7f,5.8f);// static method   
		sum.add(4.6,7.3);
		System.out.println(ans);
		System.out.println(ans1);
		
		Sum1<Integer,Double> Sum1=new Sum1<Integer,Double>(2, 3);
		System.out.println(Sum1.add());
		//System.out.println(Sum1.add(6.7,5.4));
	}

}

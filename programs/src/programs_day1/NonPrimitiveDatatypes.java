package programs_day1;

public class NonPrimitiveDatatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("test");
      int [] arr= {1,2,3,4};
      String[] strArr= {"bhavas", "yamzz","princy"};
      DemoProgram demo=new DemoProgram();    //class call 
      System.out.println(demo.name());
      System.out.println(demo.age());
      System.out.println(demo.weight());
      System.out.println(demo.gender);
      System.out.println(arr.length);
      System.out.println(strArr.length);
	}
}

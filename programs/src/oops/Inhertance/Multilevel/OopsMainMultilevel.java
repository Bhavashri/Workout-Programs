package oops.Inhertance.Multilevel;

public class OopsMainMultilevel {
	public static void main(String args[]) {
         GrandFather grandfather=new GrandFather(null);
		 Father father =new Father("Deva");
		// Father father1 =new Father("Giri");
		 Son son= new Son("Rahul");
		 grandfather.setdob("14/02/1942");
		 father.setname("Bhavas");
		 System.out.println(grandfather.getdob());
		 System.out.println(father.getName());
		 System.out.println(son.getAge());
	 }
}

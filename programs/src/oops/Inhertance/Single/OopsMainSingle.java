package oops.Inhertance.Single;

public class OopsMainSingle {
 public static void main(String args[]) {
	 Father father =new Father("Deva");
	 Father father1 =new Father("Giri");
	 Son son= new Son("Rahul");
	 //father1.setname("Bhavas");
	 System.out.println(father.getName());
	 System.out.println(father1.getName());
	 System.out.println(son.getName());
	 System.out.println(son.getAge());
 } 
}

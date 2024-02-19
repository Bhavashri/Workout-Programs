package oops.Inhertance.Hirarchical;

public class OopsMainHirarchical {
	public static void main(String args[]) {
		 Father father =new Father("Deva");
		 Father father1 =new Father("Giri");
		 Daughter daughter = new Daughter("Gracy");
		 Son son= new Son("Rahul");
		 father.setname("Bhavas");
		 System.out.println(daughter.getName());
		 System.out.println(father.getGender());
		 System.out.println(son.getGender());
		 System.out.println(daughter.getGender());
		 System.out.println(daughter.getAge());
		 System.out.println(son.getAge());
	 }
}

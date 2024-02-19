package oops.Inhertance.Hibrid;

public class OopsMainHibrid {
	public static void main(String args[]) {
		 Father father =new Father("Giri");
		 Daughter daughter = new Daughter("Gracy");
		 Son son= new Son("Rahul");
		 GrandDaughter Gdaughter=new GrandDaughter("Shri");
		// father.setname("Bhavas");
		 System.out.println(daughter.getName());
		 System.out.println(father.getGender());
		 System.out.println(son.getGender());
		 System.out.println(daughter.getGender());
		 System.out.println(daughter.getAge());
		 System.out.println(son.getAge());
		 System.out.println(Gdaughter.getPhoneNo());
		 System.out.println(Gdaughter.getGender());
		 System.out.println(Gdaughter.getName());
	 }
}

package arraylist;

import java.util.ArrayList;

public class ArrayListObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person>alPerson=new ArrayList<Person>();
		Person p1=new Person("GIRITHARAN","male",22);
		Person p2=new Person("BHAVAS","Female",22);
		Person p3 =new Person("GRACY","Female",1);
		Person p4=new Person();
		p4.setName("DEVA");
		p4.setGender("MAle");
		p4.setAge(18);
		
		alPerson.add(p1);
		alPerson.add(p2);
		alPerson.add(p3);
		alPerson.add(p4);
		alPerson.add(new Person("RAKSHI","Female",17));
		
//		for(int i=0;i<alPerson.size();i++) {
//			Person person = alPerson.get(i);
//			System.out.println("*********************************");
//			System.out.println("Name: "+person.getName());
//			System.out.println("Name: "+person.getAge());
//			System.out.println("Name: "+person.getGender());
//		}
		
//		for(Person person : alPerson) { }
//		or
//		for(int i=0;i<alPerson.size();i++) {
//			Person person = alPerson.get(i); 
//		or
//		alPerson.forEach(person -> { });
		
		alPerson.forEach(person -> {
			System.out.println("*********************************");
			System.out.println("Name: "+person.getName());
			System.out.println("Name: "+person.getAge());
			System.out.println("Name: "+person.getGender());
		});
	}

}

package arraylist;

import java.util.ArrayList;

public class TaskMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(2);
		al.add(11);
		al.add(6);
		al.add(3);
		al.add(21);
		al.add(9);
		al.add(12);
		al.add(18);
		al.add(7);
		
		ArrayListTask arraylist=new ArrayListTask(al);
		System.out.println("************************************************");
		arraylist.print(arraylist.oddArray());
		System.out.println("************************************************");
		arraylist.print(arraylist.evenArray());

	}
}
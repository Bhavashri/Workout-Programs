package arraylist;

import java.util.ArrayList;

public class ArrayListTopic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(12);
		al.add(34);
		al.add(19);
		al.add(29);
		print(al);
		System.out.println("********************Add specific index***************************");
		al.add(1,45);
		print(al);
		System.out.println("*********************Remove specific index**************************");
		al.remove(3);
		print(al);
		System.out.println("*********************Clear all**************************");
		al.clear();
		al.add(11);
		al.add(23);
		al.add(21);
		al.add(10);
		print(al);
		System.out.println("IS empty check: "+al.isEmpty());
		System.out.println("ARRAY List size: "+al.size());
		System.out.println("FIND index 12: "+al.indexOf(12));
		System.out.println("FIND index 21: "+al.indexOf(21));
		//System.out.println("IS contain the elsements: "+al.contains(34));
		
	}
	
	public static void print(ArrayList<Integer> al) {
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
	}
}

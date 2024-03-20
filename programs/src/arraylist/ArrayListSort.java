package arraylist;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListSort {
	

	    public static String titleCase(String s){
	        String is = s;
	        String ret = "";


	                ret += is.substring(0, 1).toUpperCase();

	                ret += is.substring(1).toLowerCase();
	          return ret;
	        }

	    public static ArrayList<String> sort(ArrayList<String> list){
	        for(int z = 0; z <list.size()-1; z++){
	            if(list.get(z).compareTo(list.get(z+1)) >0){
	                list.add(z, list.get(z+1));
	                list.remove(z+2);
	            }
	        }
	        return list;

	    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>al=new  ArrayList<Integer>();
		al.add(45);
		al.add(32);
		al.add(21);
		for (int i = 0; i < al.size(); i++) {
		    for (int j = al.size() - 1; j > i; j--) {
		        if (al.get(i) > al.get(j)) {
		        	  int tmp = al.get(i);
	                  al.set(i,al.get(j)) ;
	                  al.set(j,tmp);
		        }
		    }
		}
		 for (int i: al) {
	          System.out.println(i);
	      }

	        Scanner scan = new Scanner (System.in);

	        ArrayList<String> names = new ArrayList();
	        int x = 0;
	        int count = 0;
	        String output = "";

	        while(x != 1){
	        System.out.println("Enter the next name:");
	        String temp = scan.next();
	        temp = titleCase(temp);


	        if(temp.toLowerCase().equals("stop")){
	            x = 1;
	        }
	        else{

	            names.add(count, temp);
	            count++;
	        }

	        }
	      names.equals(sort(names));
	        System.out.println(names.toString());
	}


	
}

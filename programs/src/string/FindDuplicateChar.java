package string;

public class FindDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello world";
		  char[] a = str.toCharArray();
		  System.out.println("Duplicate Characters are:");
		  for (int i = 0; i < str.length(); i++) {
			  for (int j = i + 1; j < str.length(); j++) {
				  if (a[i] == a[j]) {
					  System.out.println(a[i]);
				      
				  }
			  }
		  }
		}
	}
 
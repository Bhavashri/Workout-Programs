package workout;
public class PalindromeString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n="racecar";
		String rev="";
       for(int i=n.length()-1;i>=0;i--) {
    	   rev=rev+n.charAt(i);
       } 
       if(n.equals(rev)) {
           System.out.println("it is palinrome");
	}
       else {
    	   System.out.println("not a palinrome");
       }
   }
}

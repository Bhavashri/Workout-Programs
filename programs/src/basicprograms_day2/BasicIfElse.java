package basicprograms_day2;

public class BasicIfElse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//equal to
		if(5==6) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		// not equal to
		if(5!=6) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		//not
		if(!(5!=6)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		//less then
		
		if(5<6) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		//greater
		if(5>6) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		//less then or equal to
		if(5<=6) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		//greater then or equal to
		if(5>=6) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		//And
		if(5>=5 && 5==6) { // both condition should be true
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		// Or
		if(5==6 || 5<=5) { // either one should be true 
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
}

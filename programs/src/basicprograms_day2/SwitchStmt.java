package basicprograms_day2;

public class SwitchStmt {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=3;
		//Switch
		switch(i) {
		case 1:
			System.out.println("Logic 1");
			break;
		case 2:
			System.out.println("Logic 2");
			break;
		case 3:
			System.out.println("Logic 3");
			break;
		case 4:
			System.out.println("Logic 4");
			break;
		
		}
		//nested if else if (try to skip nested if and use Switch statement)
	        if(i==1) {
		    	System.out.println("Logic 1");
			}
			else if(i==2) { 
				System.out.println("Logic 2");
			}
			else if(i==3) { 
				System.out.println("Logic 3");
			}
			else {
				System.out.println("Logic 4");
			} 
}
}

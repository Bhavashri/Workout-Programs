package twenty_practicesProgram;
import java.util.Scanner;
public class Basic_Cal_pro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		// nextDouble() reads the next double from the keyboard
		double first = reader.nextDouble();
		double second = reader.nextDouble();
		System.out.print("Enter an operator (+, -, *, /): ");
		char operator = reader.next().charAt(0);
		double result=0;
		//switch case for each of the operations
		switch(operator)
		{
		case '+':
		result=first+second;
		break;
		case '-':
		result = first-second;
		break;
		case '*':
		result = first * second;
		break;
		case '/':
		result = first / second;
		break;
		// operator doesn't match any case constant (+, -, //*, /)
		default:
		System.out.println("Error! operator is not correct");
		}
	
		//printing the result of the operations
		System.out.println(result);
	}

}

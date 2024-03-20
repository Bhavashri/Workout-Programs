package stackProgram;

public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackLogic<String> obj= new StackLogic<String>();
		obj.push("bhavas");
		obj.push("giri");
		obj.push("gracy");
		obj.print();
		System.out.println("****************************");
		obj.pop();
		obj.print();
		obj.peek();
		System.out.println("***************peek*************\n"+obj.peek());
		obj.pop();
		obj.pop();
		obj.pop();
		obj.pop();
		obj.pop();
		System.out.println("****************************");
		obj.print();
	}
}

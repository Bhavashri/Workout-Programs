package queueProgram;

public class queueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queueLogic<String> obj= new queueLogic<String>();
		obj.enqueue("bhavas");
		obj.enqueue("giri");
		obj.enqueue("gracy");
		obj.print();
		System.out.println("****************************");
		obj.dequeue(); 
		obj.print();
		obj.peek();
		System.out.println("***************peek*************\n"+obj.peek());
		obj.dequeue(); 
		obj.dequeue(); 
		System.out.println("******************************");
		obj.print();
	}

}

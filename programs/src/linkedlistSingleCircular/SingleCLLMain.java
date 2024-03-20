package linkedlistSingleCircular;

public class SingleCLLMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleCircularLL scll=new SingleCircularLL();
		scll.insert("bhavas");
		scll.insert("gracy");
		scll.insert("sumathi");
		scll.insert("durai");
		scll.deleteNode(3);
		scll.print();
	}

}

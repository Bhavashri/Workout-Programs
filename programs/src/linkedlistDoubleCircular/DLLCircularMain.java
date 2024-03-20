package linkedlistDoubleCircular;

public class DLLCircularMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleCircularLL dllc=new DoubleCircularLL();
		dllc.insert("bhavas");
		dllc.insert("rakshi");
		dllc.insert("sumathi");
		dllc.insert("durai");
		dllc.deleteNode(1);
		dllc.print();
	}
}

package queueProgram;
public class queueLogic<T> {
	queueNode <T> first=null;
	queueNode <T> last=null;
	private int length;
	
	public void enqueue(T value) {
		queueNode<T> current=new queueNode<T>(value);
		if(first==null) {
			first=current;
			last=current;
			length++;
		}
		else {
			last.connectNext = current;
			last=current;
            length++;
		}
	} 
	public T peek() {
		if(last!=null)
			return last.value;
			return null;
	}
	public int size() {
		return length;
	}
	public void dequeue(){
		if(first != null) {
			  first = first.connectNext;
			  length--;
		  }
	  }	

		public void print() {
			if(first!=null) {
				queueNode<T> current=first;
				while(current !=null) {
					System.out.println(current.value);
					current = current.connectNext;
				}
			}
			System.out.println(length);
		}

}

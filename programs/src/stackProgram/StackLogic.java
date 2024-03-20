package stackProgram;

public class StackLogic<T> {
	StackNode <T> first=null;
	StackNode <T> last=null;
	int count=0;
	private int length;
	
	public void push(T value) {
		StackNode<T> current=new StackNode<T>(value);
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
	public void pop(){
		  if(first == last) {
			  first = null;
			  last = null;
			  length=0;
		  }
		  else if (first != null) {
	      StackNode<T> current = first;
	      while(current!=null) {
	    	  if(current.connectNext == last) {
	    		  current.connectNext = null;
	    		  last = current;
	    		  length--;
	    		  break; 
	    	  }
//	    	  else {
//	    		  System.out.println("list is empty"); 
//	    	  }
	    	  current=current.connectNext;
	      }
		  }
	  }	
		public void print() {
			if(first!=null) {
				StackNode<T> current=first;
				while(current !=null) {
					System.out.println(current.value);
					current = current.connectNext;
				}
			}
			System.out.println(length);
		}
     }

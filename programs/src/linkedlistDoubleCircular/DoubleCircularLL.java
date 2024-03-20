package linkedlistDoubleCircular;

public class DoubleCircularLL {
	DLLCircularPerson head;
	DLLCircularPerson tail;
	public void insert(String name) {
		DLLCircularPerson person = new DLLCircularPerson(name);
		if(head==null) {
			person.connectNext=head;
			head=person;
			tail=person;
		}
		else {
			person.connectPrev=tail;
			person.connectNext=head;
			tail.connectNext=person;
			tail=person;
		}
	}
	void deleteNode(int position){
	      if (head == null)
	          return;
	      DLLCircularPerson temp = head;
	      if (position == 0)
	      {
	          head = temp.connectNext;   
	          return;
	      }
	      int i=0;
	      while(temp!=null && i<position-1) {
	          temp = temp.connectNext;
	          i++;
	      }
	      if (temp == null || temp.connectNext == null)
	          return;
	       DLLCircularPerson connectNext = temp.connectNext.connectNext;
	      temp.connectNext = connectNext;  
	  }
	
//	public void print() {
//		DLLCircularPerson currentPerson=head;
//		if(currentPerson!=null) {
//		do {
//			
//			System.out.println(currentPerson.name);
//			currentPerson=currentPerson.connectNext ;
//		}
//		while(currentPerson!=head);
//	}
//	}
	//reverse
	public void print() {
		DLLCircularPerson currentPerson=tail ;
		if(currentPerson!=null) {
		do {
			System.out.println(currentPerson.name);
			currentPerson=currentPerson.connectPrev;
		}
		while(currentPerson!=tail);
	}
	}
}



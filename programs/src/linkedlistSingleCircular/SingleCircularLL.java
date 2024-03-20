package linkedlistSingleCircular;

public class SingleCircularLL {
	CircularSLL head=null;
	CircularSLL tail=null;
	
	public void insert(String name) {
		CircularSLL person=new CircularSLL(name);
		if(head==null) {
			person.connectNext=person;
			head=person;
			tail=person;
		}
		else {
			person.connectNext=head;
			tail.connectNext = person;
			tail=person;
		}
	}
	void deleteNode(int position){
	      if (head == null)
	          return;
	      CircularSLL temp = head;
	      if (position == 0)
	      {
	          head = temp.connectNext;   
	          return;
	      }
	      int i=0;
	      while ( temp!=null && i<position-1) {
	          temp = temp.connectNext;
	          i++;
	      }
	      if (temp == null || temp.connectNext == null)
	          return;
	      CircularSLL connectNext = temp.connectNext.connectNext;

	      temp.connectNext = connectNext;  
	  }
//	public String printRec(String res) {
//		//int res=0;
//		CircularSLL currentPerson = head;
//		if(currentPerson!=null) {
//			System.out.println(currentPerson.name);
//			currentPerson = currentPerson.connectNext;
//			
//		if(currentPerson!=head) {
//			System.out.println(currentPerson.name);
//			currentPerson = currentPerson.connectNext;
//			return printRec(res+1);
//			}
//		}	
//		else {
//			System.out.println("List is empty");
//		}
//		return printRec(res+1);
//	}
	public void print() {
		CircularSLL currentPerson = head;
		if(currentPerson!=null) {
		do {
			System.out.println(currentPerson.name);
			currentPerson = currentPerson.connectNext;
		}
		while(currentPerson!=head);
		}	
		else {
			System.out.println("List is empty");
		}
	}
}

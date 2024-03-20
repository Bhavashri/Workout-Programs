package linkedList;

public class SingleLinkedList {
	SingleLLNode head = null;
	SingleLLNode tail = null;
	private SingleLLNode next;
	public void insert(int value) {
		SingleLLNode singleLLNode = new SingleLLNode();
		singleLLNode.setValue(value);
		
		if(head == null) {
			head = singleLLNode;
			tail = singleLLNode;
		}
		else {
			tail.setNext(singleLLNode);
			tail = singleLLNode;
		}
	}
	
	// INSERT A VALUE IN SINGLE LINKED LIST
	public void insert (int value,int position) {
		SingleLLNode newNode=new SingleLLNode();
		newNode.setValue(value);
		
		if(head == null && position ==0) {
			head=newNode;
			tail=newNode;
		}
		else if(position == 0) {
			newNode.setNext(head);
			head = newNode;
		}
		else {
			int index=1;
			SingleLLNode currentItem=head;
			while(currentItem != null) {
				if(position == index) {
					newNode.setNext(currentItem.getNext());
					currentItem.setNext(newNode);
					currentItem=newNode;
					break;
				}
				currentItem=currentItem.getNext();
				index++;
			}
			if(index < position) {
				System.out.println("index out of bound error");
			}
		}
	}
//	void deleteNode(int position)
//    {
//        // If linked list is empty
//        if (head == null)
//            return;
// 
//        // Store head node
//        SingleLLNode temp = head;
// 
//        // If head needs to be removed
//        if (position == 0)
//        {
//            head = temp.next;   // Change head
//            return;
//        }
// 
//        // Find previous node of the node to be deleted
//        for (int i=0; temp!=null && i<position-1; i++)
//            temp = temp.next;
// 
//        // If position is more than number of nodes
//        if (temp == null || temp.next == null)
//            return;
// 
//        // Node temp->next is the node to be deleted
//        // Store pointer to the next of node to be deleted
//        Node next = temp.next.next;
// 
//        temp.next = next;  // Unlink the deleted node from list
//    }

	public void print() {
		SingleLLNode currentVal = head;
		if(head != null) {
			//System.out.println("Print");
			while(currentVal!=null) {
				System.out.println(currentVal.getValue());
				currentVal = currentVal.getNext();		
				}
		}
		else {
			System.out.println("List is empty");
		}
	}
}

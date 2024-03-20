package doubleLinkedListSorting;

public class BubbleSDLLLogic {
	BubbleSDLList head, tail;
    public void BubbleSDLList(){
        head = null; tail = null;
    }
    public void insert(int data){
        BubbleSDLList val = new BubbleSDLList(data);
        if (head == null) {
            head= val;
            tail = val;   
        }
        else{
            tail.next = val;
            val.prev = tail;
            tail = val;
        }
    }
    public void bubbleSort(){
        if (head==null || head == tail) {
            return;
        }
        boolean swapped;
        BubbleSDLList current;
        BubbleSDLList lastSorted = null;
        do{
            swapped = false; 
            current = head;
            while (current.next != lastSorted) {
                if (current.data> current.next.data) {
                    swapBubble(current, current.next);
                    swapped = true;
                }
                current = current.next;
            }
            lastSorted = current;
        }
        while(swapped);
    }
    private void swapBubble(BubbleSDLList node1, BubbleSDLList node2) {
        // TODO Auto-generated method stub
        int temp = node1.data;
        node1.data= node2.data;
        node2.data = temp;
    }
    public void print(){
        BubbleSDLList current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }System.out.println();
    } 
}

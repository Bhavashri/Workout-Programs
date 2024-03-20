package doubleLinkedListSorting;

public class BubbleSDLLMain {
	public static void main(String[] args) {
        BubbleSDLLLogic dl = new BubbleSDLLLogic();
        dl.insert(54);
        dl.insert(19);
        dl.insert(7);
        dl.insert(42);
        dl.print();
        System.out.println("*******");
        dl.bubbleSort();
        dl.print();
    }
}

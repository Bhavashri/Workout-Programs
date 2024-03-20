package linkedlistSingle;

public class SLLPersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLinkedListPerson sLinkedListPerson = new SingleLinkedListPerson();
		sLinkedListPerson.insert("gracy");
		sLinkedListPerson.insert("bhavas");
		sLinkedListPerson.insert("giri");
		sLinkedListPerson.insert("mowrith");
		sLinkedListPerson.insert("kumar");
		sLinkedListPerson.deleteNode(3);
		sLinkedListPerson.print();
	}

}

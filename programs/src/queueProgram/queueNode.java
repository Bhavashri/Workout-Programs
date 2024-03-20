package queueProgram;

public class queueNode<T> {
	public T value;
	public queueNode<T> connectNext;
	public queueNode(T value) {
		this.value=value;
	} 
}

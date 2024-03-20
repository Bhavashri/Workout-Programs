package stackProgram;

public class StackNode<T>{
	public T value;
	public StackNode<T> connectNext;
	public StackNode(T value) {
		this.value=value;
	} 
}

package tree.binarySearch;
public class BstNode {
	int value;
	BstNode left;
	BstNode right;
    int data;
	public BstNode(int value) {
		this.value=value;
	}
	public void BstNode(int data) {
		this.data=data;
	}
	public BstNode getLeft() {
		return left;
	}
	public BstNode getRight() {
		return right;
	}
	public void setLeft(BstNode left) {
		this.left = left;
	}
	public void setRight(BstNode right) {
		this.right = right;
	}
		
}

package tree.binarySearch;
//import javax.swing.text.DefaultEditorkit.InsertBreakAction;
public class BstLogic {
	BstNode root=null;
	private BstNode currentRoot;
	public BstNode insert(int value) {
		if(root==null) {
			root=new BstNode(value);
			return root;
		}
		else {
			insert(root,value);
		}
		return root;
	}
		private BstNode insert(BstNode currentRoot,int value) {
			if(currentRoot==null) {
				BstNode newNode=new BstNode(value);
				return newNode;
			}
			if(value<=currentRoot.value||value == currentRoot.value) {
				System.out.println("parent : "+currentRoot.value+" left  : "+value);
				currentRoot.left=insert(currentRoot.left,value);
				//System.out.println("True");
			}
			else if(value>currentRoot.value) {
				System.out.println("parent : "+currentRoot.value+" right : "+value);
				currentRoot.right=insert(currentRoot.right,value);
				//System.out.println("false");
			}
			return currentRoot;
		}
		public BstNode find(int value) {
			currentRoot = null;
			currentRoot.left=find(value);
			currentRoot.right=find(value);
			if(value==currentRoot.value ) {
				System.out.println("True");
			}
			else {
				System.out.println("false");
			}
			return root;
			
		}
		
	}
	
	
	


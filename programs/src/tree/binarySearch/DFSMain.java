package tree.binarySearch;

import java.util.ArrayList;

public class DFSMain {
	public static void main(String args[]) {
		DFSNode root =new DFSNode(14);
		root.left= new DFSNode(6);
		root.right = new DFSNode(8);
		root.left.left = new DFSNode(9);
		root.left.right = new DFSNode(7);
		root.left.left.right = new DFSNode(11);
		root.left.left.left = new DFSNode(0);
		root.left.right.left = new DFSNode(13);
		root.left.right.right = new DFSNode(14);
		root.left.right.left.right = new DFSNode(16);
		root.right.left = new DFSNode(2);
		root.right.right = new DFSNode(1);
		root.right.left.right = new DFSNode(3);
		root.right.left.left = new DFSNode(7);
		root.right.left.right.left = new DFSNode(4);
		root.right.right.left = new DFSNode(21);
		root.right.right.left.left = new DFSNode(12);
		root.right.right.right = new DFSNode(4);
		DFSLogic dfsLogic=new DFSLogic();
		System.out.println("******************** preOrder ***********************");
		dfsLogic.preOrder(root);
		System.out.println();
		System.out.println("******************** inOrder ***********************");
		dfsLogic.inOrder(root);
		System.out.println();
		System.out.println("******************** postOrder ***********************");
		dfsLogic.postOrder(root);
		System.out.println();
		System.out.println("******************** Height ***********************");
		System.out.print(dfsLogic.height(root, 0));
		System.out.println(); 
		System.out.println("******************** BFS FIFO ***********************");
		dfsLogic.printBFD(root);
		System.out.println(); 
		DFSNode treeMirror=dfsLogic.treeMirror(root);
		System.out.println("******************** mirror ***********************");
		dfsLogic.printBFD(treeMirror);
		System.out.println();
		System.out.println("*************** maximum no.of width *****************");
		System.out.print(dfsLogic.treeWidthMax(root));
		System.out.println();
		System.out.println("*************** maximum no.of width *****************");
		ArrayList<int[]>width=dfsLogic.widthTree(root,new ArrayList<int[]>(),0);
		int[] widthTree = new int[dfsLogic.height(root,0)+1];
		for(int i=0;i<width.size();i++) {
			int j = width.get(i)[0];
			widthTree[j]=widthTree[j]+width.get(i)[1];
			//System.out.println("Level:"+width+" size:"+width.get(i)[1]);
		}
		int maxWidth = 0;
		for(int i = 0; i<widthTree.length; i++) {
			if(maxWidth < widthTree[i]) {
				maxWidth = widthTree[i];
			}
		}
		System.out.println("maxWidth: " +maxWidth);
		DFSNode root2=new DFSNode(14);
		root2.left= new DFSNode(6);
		root2.right = new DFSNode(8);
		//dfsLogic.printBFD(root2);
	}
}
package tree.binarySearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DFSLogic{
	DFSNode root;
	private Object i;
	public void setRoot(DFSNode root) {
		this.root = root;
	}
	
	public void preOrder(DFSNode child) {
		if(child != null) {
		System.out.print(" "+child.value);
		preOrder(child.left);
		preOrder(child.right);
		}
//		else {
//			return;
//		}
	}
	public void inOrder(DFSNode child) {
		if(child != null) {
		inOrder(child.left);
		System.out.print(" "+child.value);
		inOrder(child.right);
		}
	}
	public void postOrder(DFSNode child) {
		if(child != null) {
			postOrder(child.left);
			postOrder(child.right);
			System.out.print(" "+child.value);
		}
	}
	public int height(DFSNode root,int i){
		i=0;
		if(root ==null) {
			return i;
		}
		int lh=height(root.left,i);
		int rh=height(root.right,i);
		if(lh<rh) {
			return rh+1;
		}
		else {
			return lh+1;
		}
	}
	public void printBFD(DFSNode root) {
		Queue<DFSNode> queue = new LinkedList<DFSNode>();
		queue.offer(root);
		DFSNode temp;
		while(queue.size()!=0) {
			DFSNode current = queue.poll();
			System.out.print(" "+current.value);
			if(current.left!=null) {
				queue.offer(current.left);
			}
			if(current.right!=null) {
				queue.offer(current.right);
			}
		}
	}
	public  DFSNode treeMirror(DFSNode root) {
		if(root==null) {
			return root;
		}
	 DFSNode left = treeMirror(root.left);
	 DFSNode right = treeMirror(root.right);
	 if(left != null|| right!=null) {
		 root.left=right;
		 root.right=left;
	 }
	return root;
	}
	public int treeWidthMax(DFSNode root) {
		int i=0;
		int height = height(root, i);
        int maxWidth = 0;
        for (int row = 1; row < height; row++) {
            int width = treeWidth(root, row);
            if (width > maxWidth) {
                maxWidth = width;
            }
        }
        return maxWidth;
    }

    private int treeWidth(DFSNode root, int row) {
        if (root == null)
            return 0;
        if (row == 1)
            return 1;
        else if (row > 1)
            return treeWidth(root.left, row-1 ) + treeWidth(root.right, row-1);
        return 0;
    }
    
    public ArrayList<int[]> widthTree(DFSNode root,ArrayList<int[]> width, int level){
    	if(root == null) {
    		return width;
    	}
    	int[] level_size = new int[2];
    	level_size[0]=level;
    	level_size[1]=0;
    	if(root.left!=null && root.right != null)
    		level_size[1]=2;
    	else if(root.left != null || root.right!=null)
    		level_size[1]=1;
    	width.add(level_size);
    	width = widthTree(root.left,width,level +1);
    	width = widthTree(root.right,width,level +1);
    	return width;
    }
//    public void print(DFSNode root,int height) {   
//    	int n=11;                                   
//    	for(int i=1;i<=height;i++) {
//    		
//    	}
//    }
    public void print(DFSNode root,int height,int x,int y,int n) {
    	int totaln=height*n;
    	int mid=totaln/2;
    	
    	int leftStar =mid, rightStart = mid;
    	for(int i=0;i<mid+1;i++) {
    		for(int j=0;j<totaln;j++) {
    		if(mid==j && i==0) {
    			System.out.print(root.value);
    		}
    		else if(j==0 && i==mid) {
    			System.out.print(""+root.left.value+"");
    		}
    		else if(j==n-1 && i==mid) {
    			System.out.print(""+root.right.value+"");
    		}
    		else if(leftStar ==j||rightStart==j) {
    			System.out.print("*");
    		}
    		System.out.print("  ");
    	}
    		System.out.print(" ");
    	}
    		leftStar--;
    		rightStart++;
    }
    }



package bfsDfs;

class Node{
	int data;
	Node lt, rt; // lt: left, rt: right
	public Node(int val) {
		data = val;
		lt = null;
		rt = null;
	}
	
}

// if ~ else 재귀 호출

public class DFS {	
	Node root;
	public static void main(String[] args) {
		DFS tree = new DFS();
		tree.root = new Node(0);
		tree.root.lt = new Node(1);
		tree.root.rt = new Node(2);
		tree.root.lt.lt=new Node(3);
		tree.root.lt.rt=new Node(4);
		tree.root.rt.lt=new Node(5);
		tree.root.rt.rt=new Node(6);
		tree.DFS(tree.root);
		
		

	}
	
	// DFS logic
	public void DFS(Node root) {
		if(root == null) return;
		else {
			System.out.print(root.data + " ");
			DFS(root.lt);
			DFS(root.rt);
		}
	}
}

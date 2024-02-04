package bfsDfs;

import java.util.LinkedList;
import java.util.Queue;


public class BFS {
	
	Node root;
	public static void main(String[] args) {
		BFS tree = new BFS();
		tree.root = new Node(0);
		tree.root.lt = new Node(1);
		tree.root.rt = new Node(2);
		tree.root.lt.lt = new Node(3);
		tree.root.lt.rt = new Node(4);
		tree.root.rt.lt = new Node(5);
		tree.root.rt.rt = new Node(6);
		tree.BFS(tree.root);
	}

	
	// DFS logic
	public void BFS(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.offer(root);
		int lv = 0; // level
		while (!q.isEmpty()) {
			int l = q.size();
			System.out.print(lv +" : ");
			for(int i=0; i<l; ++i) {
				Node current = q.poll();
				System.out.print(current.data+" ");
				if(current.lt != null) {
					q.offer(current.lt);
				}
				if(current.rt != null) {
					q.offer(current.rt);
				}
			}
			lv++;
			System.out.println();
		}
	}
}

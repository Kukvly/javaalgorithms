package pt.platinum4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

class Node{
	int data;
	Node lt, rt;
	public Node(int val) {
		data = val;
		lt = null;
		rt = null;
	}
}

public class B_18251 {
	Node root;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()) + 1;
//		int k = getK(n);
		int k = 0;
		
		int wArr[] = new int[n];
		ArrayList<Integer>[] depth = new ArrayList[k];
		for(int i=0; i<k; i++) {
			depth[i] = new ArrayList<>(1<<i);
		}
			
		Queue<int[]> q = new ArrayDeque<>();
		
		String input[] = br.readLine().split(" ");
		
		B_18251 tree = new B_18251();
		tree.root = new Node(1);
	}
	
	public void DFS(Node root) {
		if(root == null) return;
		else {
			System.out.print(root.data);
			DFS(root.lt);
			DFS(root.rt);
		}
	}
}

package gd.gold_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/**
 * 
 * @author kukvly
 * 방향 그래프가 주어지면 주어진 시작점에서 
 * 다른 모든 정점으로의 최단 경로를 구하는 프로그램 작성
 * 
 * 간선의 가중치 w <= 10
 * 
 * 
 * 첫째 줄에 정점의 개수 V와 간선의 개수 E가 주어짐
 * (1<=V<=20000, 1<=E<=300000)
 * 모든 정점에는 1 ~ V 까지의 번호가 매겨짐
 * 둘째 줄에는 시작 정점의 번호 (1<=K<=V)가 주어짐
 * 셋째 줄부터 E개의 줄에 걸쳐 각 간선을 나타내는 3개의 정수 
 * (u, v, w)가 주어짐.
 * 
 * 추상 클래스
 * 인터페이스
 * 구조체
 * 생성자
 * 다익스트라
 *
 */

public class B_1753 {
	static class Node implements Comparable<Node>{
		int vertex, weight;
	
		public Node(int vertex, int weight) {
			this.vertex = vertex;
			this.weight = weight;
		}
		
		@Override
		public int compareTo(Node o) {
			return this.weight - o.weight;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		int V = Integer.parseInt(input[0]);		// V
		int E = Integer.parseInt(input[1]);		// E
		int K = Integer.parseInt(br.readLine()); 	// startNum
		
		List<List<Node>> graph = new ArrayList<>();
		
		for(int i=0; i<=V; i++) {
			graph.add(new ArrayList<>());
		}
		
		// w: u -> v 로 가는 가중치
		for(int i=0; i<E; i++) {
			input = br.readLine().split(" ");
			int u = Integer.parseInt(input[0]);
			int v = Integer.parseInt(input[0]);
			int w = Integer.parseInt(input[0]);
			
			graph.get(u).add(new Node(v, w));
		}
		
		int[] dist = new int [V+1];
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[K] = 0;
		
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.add(new Node(K, 0));
		
		while (!pq.isEmpty()) {
			Node current = pq.poll();
			int currVertex = current.vertex;
			int nextWeight = currWeight + 
		}
		
	}
}

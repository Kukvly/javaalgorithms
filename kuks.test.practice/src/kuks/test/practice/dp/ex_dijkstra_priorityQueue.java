package kuks.test.practice.dp;

import java.util.Arrays;
import java.util.PriorityQueue;

// 다익스트라 알고리즘은 DP를 이용했다는 점에서 간결하다.
// O(N^2)의 시간 복잡도

public class ex_dijkstra_priorityQueue {

	public static int n = 6;
	public static int INF = 10000000;
	public static boolean v[] = new boolean[n]; // 방문한 노드
	public static int d[] = new int[n]; // 거리
	public static int[][] arr = { { 0, 2, 5, 1, INF, INF }, { 2, 0, 3, 2, INF, INF }, { 5, 3, 0, 3, 1, 5 },
			{ 1, 2, 3, 0, 1, INF }, { INF, INF, 1, 1, 0, 2 }, { INF, INF, 5, INF, 2, 0 } };

	public static void main(String[] args) {

		dijkstra(0);
		for (int i = 0; i < n; i++) {
			System.out.println(d[i]);
		}
	}

	public static void dijkstra(int start) {
		Arrays.fill(d, INF); // 배열 d를 INF로 채움
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.offer(new Node(start, 0));
		d[start] = 0;

		while (!pq.isEmpty()) {
			Node node = pq.poll();
			int current = node.index;
			if (v[current])
				continue;
			v[current] = true;
			for (int j = 0; j < n; j++) {
				if (!v[j] && d[current] + arr[current][j] < d[j]) {
					d[j] = d[current] + arr[current][j];
					pq.offer(new Node(j, d[j]));
				}
			}
		}
	}

	static class Node implements Comparable<Node> {
		int index;
		int distance;

		Node(int index, int distance) {
			this.index = index;
			this.distance = distance;
		}

		@Override
		public int compareTo(Node o) {
			return this.distance - o.distance;
		}
	}
}

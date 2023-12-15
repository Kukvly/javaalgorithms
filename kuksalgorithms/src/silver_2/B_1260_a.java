package silver_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @author kukvly 그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하시오. 단, 방문할 수 있는 정점이 여러 개인
 *         경우에는 정점 번호가 작은 것을 먼저 방문하고, 더 이상 방문할 수 있는 점이 없는 경우 종료한다. 정점 번호는 1 ~ N
 *         까지
 * 
 *         input 첫째 줄에 정점 개수 N, 간선 개수 M, 탐색 시작 정점 V 다음 M개의 줄에는 간선이 연결하는 두 정점의 번호
 *         어떤 두 정점 사이에 여러 개의 간선이 있을 수 있다. 입력으로 주어지는 간선은 양방향이다.
 * 
 *         4 5 1 1 2 1 3 1 4 2 4 3 4
 * 
 *         output 첫째 줄에 DFS를 수행한 결과를, 그 다음 줄에는 BFS를 수행한 결과를 출력한다. V부터 방문된 점을
 *         순서대로 출력하면 된다.
 * 
 *         1 2 4 3 1 2 3 4
 *
 *
 *
 */

public class B_1260_a {

	static int N, M, V; // 정점의 개수 N, 간선의 개수 M, 시작 정점 V
	static boolean[] visited; // 방문 여부를 체크하는 배열
	static ArrayList<ArrayList<Integer>> graph; // 그래프를 표현하는 인접 리스트

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);
		V = Integer.parseInt(input[2]);

		visited = new boolean[N + 1];
		graph = new ArrayList<>();

		// 그래프 초기화
		for (int i = 0; i <= N; i++) {
			graph.add(new ArrayList<Integer>());
		}

		// 간선 정보 입력
		for (int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			// 양방향 간선이므로 양쪽에 모두 추가
			graph.get(a).add(b);
			graph.get(b).add(a);
		}

		// 그래프 정점별로 정렬
		for (int i = 1; i <= N; i++) {
			Collections.sort(graph.get(i));
		}

		// DFS 수행
		dfs(V);
		System.out.println();

		// BFS 수행
		visited = new boolean[N + 1]; // BFS를 위해 visited 배열 초기화
		bfs(V);

		sc.close();
	}

	// 깊이 우선 탐색(DFS)
	private static void dfs(int node) {
		visited[node] = true;
		System.out.print(node + " ");

		for (int next : graph.get(node)) {
			if (!visited[next]) {
				dfs(next);
			}
		}
	}

	// 너비 우선 탐색(BFS)
	private static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<>();
		visited[start] = true;
		queue.offer(start);

		while (!queue.isEmpty()) {
			int current = queue.poll();
			System.out.print(current + " ");

			for (int next : graph.get(current)) {
				if (!visited[next]) {
					visited[next] = true;
					queue.offer(next);
				}
			}
		}
	}

}

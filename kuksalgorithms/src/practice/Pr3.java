package practice;

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
 *         4 5 1 1 2 1번 2번 연결 1 3 1번 3번 연결 1 4 1번 4번 연결 2 4 2번 4번 연결 3 4 3번 4번
 *         연결
 * 
 *         output 첫째 줄에 DFS를 수행한 결과를, 그 다음 줄에는 BFS를 수행한 결과를 출력한다. V부터 방문된 점을
 *         순서대로 출력하면 된다.
 * 
 *         1 2 4 3 1 2 3 4
 *
 *
 *
 */

public class Pr3 {

	static int n, m, v; // 정점의 개수 N, 간선의 개수 M, 시작 정점 V
	static boolean[] visited; // 방문 여부를 체크하는 배열

	// list를 list의 요소로 초기화할 때 사용
	static ArrayList<ArrayList<Integer>> graph; // 그래프를 표현하는 인접 리스트

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		n = Integer.parseInt(input[0]);
		m = Integer.parseInt(input[1]);
		v = Integer.parseInt(input[2]);

		// DFS를 위한 visited 배열 초기화
		visited = new boolean[n + 1]; // node number 표현을 위해 visited 배열 사이즈를 n+1로 함
		graph = new ArrayList<>();

		// 그래프 초기화 -> null 값 담긴 배열을 list의 인자로 초기화
		for (int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Integer>());
			System.out.println("i: " + i);
			System.out.println("graph.get(" + i + "): " + graph.get(i));
		}

		System.out.println("==================================================");
		System.out.println("");
		// 간선 정보 입력
		for (int i = 0; i < m; i++) {
			String nodeInfo[] = br.readLine().split(" ");
			int a = Integer.parseInt(nodeInfo[0]);
			int b = Integer.parseInt(nodeInfo[1]);
			System.out.println("a_" + a + "---------------------------------------");
			// 양방향 간선이므로 양쪽에 모두 추가
			graph.get(a).add(b); // a번째 인덱스에 해당하는 null 값 담긴 배열에 b라는 값 입력
			System.out.println("graph.get(" + a + "): " + graph.get(a));

			System.out.println("b_" + b + "---------------------------------------");
			graph.get(b).add(a); // b번째 인덱스에 해당하는 null 값 담긴 배열에 a라는 값 입력
			System.out.println("graph.get(" + b + "): " + graph.get(b));
		}
		
		System.out.println("");
		System.out.println("====================kuks chk======================");
		System.out.println("");
		
		for (int i = 1; i <= n; i++) {
			System.out.print("graph.get(" + i + "): ");
			System.out.println(graph.get(i));
		}

		System.out.println("");
		System.out.println("==================================================");
		System.out.println("");
		
		// 그래프 정점별로 정렬
		for (int i = 1; i <= n; i++) {
			Collections.sort(graph.get(i));
			System.out.print("graph.get(" + i + "): ");
			System.out.println(graph.get(i));
		}

		// kuks chk
		System.out.println("");
		System.out.println("kuks chk");
		System.out.println("==================================================");
		System.out.println("");

//		// DFS 수행
//		dfs(v);
//		System.out.println();
//
//		// BFS 수행
//		// BFS를 위해 visited 배열 초기화
//		visited = new boolean[n + 1];
//		bfs(v);
		System.out.println("------------------------------");
		System.out.println("---------- - -----------------");
		System.out.println("---------     ----------------");
		System.out.println("------------- ----------------");
		System.out.println("-------  ---- ----  ----------");
		System.out.println("--------- -- - -- ------------");
		System.out.println("----------- - - --------------");
		System.out.println("---------- -- -- -------------");
		System.out.println("--------   -- --   -----------");
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		System.out.println("start-------------------------");
		System.out.println("------------------------------");
		
		// sort 후 dfs 호출한 것임
		dfs(v);
	}

	// 깊이 우선 탐색(DFS)
	// 1 2 4 3
	private static void dfs(int node) {
		visited[node] = true;
		System.out.println("call dfs ----------------------");
		System.out.print("kuksAnswer: "+ node + " ");

		
		for (int next : graph.get(node)) {
			System.out.println("node_num: "+node+"--------------------");
			System.out.println("graph.get("+node+"): " + graph.get(node));
			System.out.println("next: " + next);
			System.out.println("visited["+node+"]: " + visited[node]);
			if (!visited[next]) {
				System.out.println("dfs ok?");
				dfs(next);
			} else {
				System.out.println("dfs no~");
			}
		}
	}

	// 너비 우선 탐색(BFS)
	private static void bfs(int start) {
		// queue -> 선입선출
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

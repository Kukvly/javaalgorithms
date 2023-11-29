package silver_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * @author kukvly
 * 한 해커가 잘 알려진 어느 회사를 해킹하려 한다. PC: N개 한 번의 해킹으로 여러 PC를 해킹할 수 있는
 * PC를 해킹하려 한다. 이 회사의 PC는 신뢰하는 관계, 신뢰하지 않는 관계로 이루어져 있다. A가 B를 신뢰하는 경우에는
 * B를 해킹하면, A도 해킹할 수 있다. 이 회사의 PC의 신뢰하는 관계가 주어졌을 때, 한 번에 가장 많은 PC를 해킹할 수
 * 있는 PC의 번호를 출력하는 program을 작성하시오.
 * 
 * input n <= 10,000 m <= 100,000 
 * n m (n=5, m=4) 3 1 3이 1을 신뢰한다. 3 2 3이 2를 신뢰한다. 4 3 4가 3을 신뢰한다. 
 * 5 3 5가 3을 신뢰한다.
 * 
 * output 첫째 줄에 해커가 한 번에 가장 많은 PC를 해킹할 수 있는 
 * PC의 번호를 오름차순으로 출력 1 2
 *         
 * DFS (깊이 우선 탐색) 사용 알고리즘
 */

public class B_1325_a {
	static int N, M;
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int[] result;
    static int maxCount;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
        }

        result = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            visited = new boolean[N + 1];
            dfs(i);
        }

        int max = 0;
        for (int i = 1; i <= N; i++) {
            max = Math.max(max, result[i]);
        }

        StringBuilder answer = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            if (result[i] == max) {
                answer.append(i).append(" ");
            }
        }

        System.out.println(answer);
    }

    static void dfs(int start) {
        visited[start] = true;
        for (int node : graph[start]) {
            if (!visited[node]) {
                result[node]++;
                dfs(node);
            }
        }
    }
}

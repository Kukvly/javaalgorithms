package sv.silver_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 
 * @author kukvly
 * 특정 거리의 도시 찾기
 * <단방향 최단거리> -> 처음보는 유형
 * 
 *
 */

public class B_18352_a {

	static List<Integer> rtnList;
	static ArrayList<Integer>[] graph;
	static int n,m,k,x;
	static Queue<Integer> q = new LinkedList<>();
	static int[] visited;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		
		n = Integer.parseInt(input[0]);
		m = Integer.parseInt(input[1]);
		k = Integer.parseInt(input[2]);
		x = Integer.parseInt(input[3]);
		graph = new ArrayList[n+1];
		rtnList = new ArrayList<>();
		
		for(int i=1; i<=n; i++) {
			graph[i] = new ArrayList<Integer>();
		}
		
		for(int i=1; i<=m; i++) {
			input = br.readLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			
			// 단방향
			graph[a].add(b);
		}
		
		// 방문 배열 초기화
		visited = new int[n+1];
		
		// 방문 배열 생성
		for(int i=0; i<=n; i++) {
			visited[i] = -1;
		}
		
		bfs(x);
		
		for(int i=0; i<=n; i++) {
			if(visited[i] == k) {
				rtnList.add(i);
			}
		}
		
		if (rtnList.isEmpty()) {
			System.out.println("-1");
		} else {
			Collections.sort(rtnList);
			for (int i: rtnList) {
				System.out.println(i);
			}
		}
		
	}
	
	public static void bfs(int x) {
		visited[x]++;
		q.add(x); // 시작 정점 추가
		
		while(!q.isEmpty()) {
			int tmp = q.poll();
			for(int i : graph[tmp]) {
				if(visited[i]==-1) {
					visited[i] = visited[tmp] + 1;
					q.add(i);
				}
			}
		}
	}

}

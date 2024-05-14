package sv.silver_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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

public class B_18352 {

	static List<Integer> rtnList;
	static List<List<Integer>> kuksList;
	static int n,m,k,x;
	static Queue<Integer> q = new LinkedList<>();
	static boolean[] visited;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		
		n = Integer.parseInt(input[0]);
		m = Integer.parseInt(input[1]);
		k = Integer.parseInt(input[2]);
		x = Integer.parseInt(input[3]);
		kuksList = new ArrayList<>();
		rtnList = new ArrayList<>();
		
		for(int i=1; i<=n; i++) {
			kuksList.add(new ArrayList<>());
		}
		
		for(int i=1; i<=m; i++) {
			input = br.readLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			
			// 단방향
			kuksList.get(a).add(b);
		}
		visited = new boolean[n+1];
		bfs(x);
		
		if(rtnList.isEmpty()) {
			System.out.println(-1);
		} else {
			for(int i: rtnList) {
				System.out.println(i);
			}
		}
		
	}
	
	public static void bfs(int x) {
		visited[x] = true;
		q.add(x); // 시작 정점 추가
		
		int distance = 0;
		while(!q.isEmpty()&&distance<=k) {
			int size = q.size();
			for(int i=0; i<size; i++) {
				int current = q.poll();
				if(distance==k) {
					rtnList.add(current);
				}
				for(int next: kuksList.get(current)) {
					if(!visited[next]) {
						visited[next] = true;
						q.add(next);
					}
				}
			}
			distance++;
		}
	}

}

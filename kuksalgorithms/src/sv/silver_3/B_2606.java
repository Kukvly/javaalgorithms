package sv.silver_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author kukvly
 * 
 * 탐색 문제
 * 
 * input
 * 컴퓨터의 수 n <= 100
 * 네트워크상에 직접 연결된 쌍 수 m
 * m개의 쌍들...
 * 
 * 
 * 
 *
 */

public class B_2606 {
	
	static int n,m;
	
	static int arr[][];
	
	static boolean[] visited;
	
	static int cnt = 0;
	
//	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		m = Integer.parseInt(br.readLine());
		
		arr = new int [n+1][n+1];
		visited = new boolean[n+1];
		
		
		
		for (int i=1; i<=m; i++) {
			String input[] = br.readLine().split(" ");
			
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			
			arr[a][b] = arr[b][a] = 1;
			
		}
		
		dfs(1);
//		n-=cnt;
		System.out.println(cnt-1);
//		System.out.println(sb);
	}
	
	public static void dfs(int start) {
		visited[start] = true;
		
		cnt++;
		for(int i=1; i<=n; i++) {
			if(arr[start][i] == 1 && visited[i]==false) {
				dfs(i);
			}
		}
	}

}

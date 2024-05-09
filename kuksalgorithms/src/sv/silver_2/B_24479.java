package sv.silver_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_24479 {

	static int n,m,r;
	
	static boolean visited[];
	
	static int arr[][];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String input[] = br.readLine().split(" ");
		n = Integer.parseInt(input[0]);
		m = Integer.parseInt(input[1]);
		r = Integer.parseInt(input[2]);
		
		arr = new int[n+1][n+1];
		visited = new boolean[n+1];
		
		for(int i=1; i<=m; i++) {
			input = br.readLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			 
			arr[a][b] = arr[b][a] = 1;
		}
		
		dfs(r);
		
		
		// 이 부분을 착안하는데 애먹었음
		for(int i=1; i<=n; i++) {
			if(visited[i]==false) {
				System.out.println(0);
				return;
			}
		}
	}
	
	public static void dfs(int start) {
		visited[start] = true;
		System.out.println(start);
		for(int i=1; i<=n; i++) {
			if(arr[start][i] == 1 && visited[i] == false) {
				dfs(i);
			}
		}
		
	}

}

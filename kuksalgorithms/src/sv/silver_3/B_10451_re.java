package sv.silver_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_10451_re {
	static int cnt;
	static int arr[];
	static boolean visited[];
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int x=0; x<t; x++) {
			int n = Integer.parseInt(br.readLine());
			arr = new int [n+1];
			visited = new boolean[n+1];
			cnt = 0;
			String input[] = br.readLine().split(" ");
			for(int i=1; i<=n; i++) {
				arr[i] = Integer.parseInt(input[i-1]);
			}
			
			for(int i=1; i<=n; i++) {
				if(!visited[i]) {
					dfs(n);
					cnt++;
				}
			} 
			
			bw.write(String.valueOf(cnt)+"\n");
		}
	}
	
	public static void dfs(int node) {
		visited[node] = true;
		
		int next = arr[node];
		if(!visited[next]) {
			dfs(next);
		}
	}
	
	

}

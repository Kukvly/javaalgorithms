package lv3;

import java.io.*;
/**
 * 
 * @author kukvly
 * 나무 조경
 * 
 * 2 <= n <= 4
 * 1 <= 나무의 키 <= 10
 * 
 * 
 */

public class Prac_3 {
	static int n, rtn;
	static int arr[][];
	
    static boolean visited [][];
    static final int dx [] = {0, 1};
    static final int dy [] = {1, 0};
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		
		n = Integer.parseInt(br.readLine());	// 격자크기 size
		rtn = -1;
		
		arr = new int [n][n];	// 나무의 키정보 배열
		visited = new boolean[n][n];
		for(int i=0; i<n; i++) {
			String input[] = br.readLine().split(" ");
			for(int j=0; j<n; j++) {
				arr[i][j] = Integer.parseInt(input[j]);
			}
		}
		
		int maxDepth = 4;
		if(n==2) {
			maxDepth = 2;
		} 
		
		dfs(0, 0, maxDepth);
		
		bw.write(String.valueOf(rtn));
		bw.close();
	}
	
	public static void dfs(int depth, int sum, int maxDepth) {
		if(depth == maxDepth) {
			rtn = Math.max(rtn, sum);
			return;
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if (visited[i][j])
					continue;
				
				for(int k=0; k<2; k++) {
					int nx = dx[k] + i;
					int ny = dy[k] + j;
					
					if(!inyn(nx, ny)) continue;
					
					visited[i][j] = true;
					visited[nx][ny] = true;
					dfs(depth+1, sum+arr[i][j] + arr[nx][ny], maxDepth);
					visited[i][j] = false;
					visited[nx][ny] = false;
				}		
				
			}
		}
	}
	
	public static boolean inyn(int nx, int ny) {
		return nx>=0 && nx<n && ny>=0 && ny<n && (!visited[nx][ny]);
	}

}

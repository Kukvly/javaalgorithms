package tested;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author kukvly
 * m: 인원
 * n: 변
 */
public class namu {

	static int n, m;
	static int[][] grid;
	static int[][][] dp; // dp[i][j][k]: i번째 친구가 (j,k) 위치에서 시작했을 때의 최대 열매 수
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		
		n = Integer.parseInt(input[0]); // 변
		m = Integer.parseInt(input[1]); // 인원
		
		// 나무의 열매 수확량 정보 입력
		grid = new int[n][n];
		for(int i=0; i<n; i++) {
			input = br.readLine().split(" ");
			for(int j=0; j<n; j++) {
				grid[i][j] = Integer.parseInt(input[j]);
			}
		}
		
		// 각 친구의 시작 위치 입력
		dp = new int[m][n][n];
		
		for(int i=0; i<m; i++) {
			input = br.readLine().split(" ");
			int x = Integer.parseInt(input[0]);
			int y = Integer.parseInt(input[1]);
			
			// 친구의 시작 위치에서 시작하여 최대 열매 수확량 계산
			int maxFruits = dfs(i, x, y, 0);
			System.out.println(maxFruits);
		}

	}
	
	// DFS로 최대 열매 수확량 계산
	static int dfs(int friend, int x, int y, int time) {
		// 범위를 벗어난 경우 or 이미 방문한 칸인 경우
		if(x<0 || x>=n || y<0 || y>=n || time >=3 || dp[friend][x][y] != 0) {
			return 0;
		}
		
		// 현재 위치의 열매 수확량
		int fruits = grid[x][y];
		
		// 현재 위치를 방문했다고 표시
		dp[friend][x][y] = 1;
		
		// 인접한 칸으로 이동하면서 최대 열매 수확량 계산
		int maxFruits = Math.max(fruits,
				Math.max(dfs(friend, x+1, y, time +1),
						Math.max(dfs(friend, x-1, y, time +1),
								Math.max(dfs(friend, x, y+1, time+1), dfs(friend, x, y-1, time+1)))));
		
		// 현재 위치를 다시 방문하지 않은 상태로 변경
		dp[friend][x][y] = 0;
		
		return maxFruits;
	}

}
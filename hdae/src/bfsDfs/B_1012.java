package bfsDfs;

/**
 * 
 * @author kukvly 유기농 배추 한 배추의 상하좌우 네 방향에 다른 배추가 위치한 경우 -> 서로 인접해있는 것 T: 테스트 케이스
 *         수 M: 가로 N: 세로 (1<=M,N<=50) K 위치의 개수 K개의 X Y (0<=X<=M-1), (0<=Y<=N-1)
 * 
 *         두 배추의 위치가 같은 경우는 없다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1012 {

	static int[][] vegArr;
	static int m, n;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		
		for (int i = 0; i < t; i++) {
			String input[] = br.readLine().split(" ");
			m = Integer.parseInt(input[0]); // 가로
			n = Integer.parseInt(input[1]); // 세로
			int k = Integer.parseInt(input[2]); // 배추 개수
			
			vegArr = new int[n][m];

			for (int j = 0; j < k; j++) {
				input = br.readLine().split(" ");
				int x = Integer.parseInt(input[0]);
				int y = Integer.parseInt(input[1]);
				vegArr[y][x] = 1;
			}

			int result = countWorms();
			System.out.println(result);
		}
	}

	static void dfs(int x, int y) {
		// x, y가 범위를 벗어나면 탐색하지 않겠다.
		if (x < 0 || x >= n || y < 0 || y >= m) {
			return;
		}

		if (vegArr[x][y] == 1) {
			vegArr[x][y] = 0;

			// 상, 하, 좌, 우 방향으로 DFS 호출
			dfs(x + 1, y); // 우
			dfs(x - 1, y); // 좌
			dfs(x, y + 1); // 상
			dfs(x, y - 1); // 하
		}
	}

	static int countWorms() {
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (vegArr[i][j] == 1) {
					dfs(i, j);
					count++;
				}
			}
		}
		return count;
	}
}
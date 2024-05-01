package sv.silver_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @author kukvly 내가 제일 못하는 유형 <미로탐색>
 * 
 * 
 *
 */
public class B_2178 {

	static int n, m;
	static int arr[][];
	static boolean visited[][];
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		n = Integer.parseInt(input[0]);
		m = Integer.parseInt(input[1]);
		
		arr = new int[n][m];
		visited = new boolean[n][m];

		for (int i = 0; i < n; i++) {
			input = br.readLine().split("");
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(input[j]);
			}
		}

		bfs(0, 0);

		System.out.println(arr[n - 1][m - 1]);
	}

	static void bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] {x, y});
		visited[x][y] = true;
			
		while (!queue.isEmpty()) {
			int current[] = queue.poll();
			int cx = current[0];
			int cy = current[1];
			
			// 상하좌우
			for (int i=0; i<4; i++) {
				int nx = cx + dx[i];
				int ny = cy + dy[i];
				
				if(nx>=0 && nx<n && ny>=0 && ny<m && arr[nx][ny]==1 && !visited[nx][ny]) {
					queue.offer(new int[] {nx, ny});
					visited[nx][ny] = true;
					arr[nx][ny] = arr[cx][cy] + 1;
				}
			}
		}
	}

}

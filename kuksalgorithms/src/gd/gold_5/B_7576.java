package gd.gold_5;

/**
 * 1: 익은 토마토
 * 0: 안익은 토마토
 * -1: 토마토 없음
 * 
 * 2 <= m,n >= 1,000
 * 
 * 탐색의 대표적인 유형 중 하나
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class B_7576 {

	static int m, n, days;
	static int arr[][];
	static int dx[] = { 1, 0, -1, 0 };
	static int dy[] = { 0, 1, 0, -1 };
	static Queue<int[]> q = new LinkedList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		m = Integer.parseInt(input[0]);
		n = Integer.parseInt(input[1]);

		arr = new int[n][m];

		for (int i = 0; i < n; i++) {
			input = br.readLine().split(" ");
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(input[j]);
			}
		}

		// 익은 토마토의 좌표를 큐에 추가
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] == 1)
					q.offer(new int[] { i, j });
			}
		}
		
		// 첫 번째 탐색할 때부터 1이 카운트 됨을 방지하기 위함
		// 0으로 한 후에 출력시 days -1 를 해줘도 됨
		// 시작점이 1이 되면 안되기 때문 (0에서 시작해야지)
		days = -1;
		
		int rtn = bfs();
		System.out.println(rtn);

	}

	static int bfs() {
		while (!q.isEmpty()) {
			int size = q.size();

			for (int i = 0; i < size; i++) {
				int cur[] = q.poll();

				for (int d = 0; d < 4; d++) {
					int nx = cur[0] + dx[d];
					int ny = cur[1] + dy[d];

					if (nx >= 0 && ny >= 0 && nx < n && ny < m && arr[nx][ny] == 0) {
						arr[nx][ny] = 1;
						q.offer(new int[] { nx, ny });
					}
				}
			}

			days++;
		}

		// 토마토 모두 익었는지 확인
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] == 0) {
					return -1;
				}
			}
		}

		return days;
	}

}

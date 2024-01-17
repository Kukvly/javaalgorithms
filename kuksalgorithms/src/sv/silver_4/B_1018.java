package sv.silver_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author kukvly n x m -> n행 m열 변을 공유하는 두 개의 사각형은 다른 색으로 칠해져 있어야 한다. 맨 왼쪽 위 칸이
 *         흰색인 경우, 혹은 검은색 경우
 * 
 *         caseCnt = 2 * (n-7) * (m-7)
 */

public class B_1018 {

	public static int min = 64;
	public static boolean arr[][];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);

		arr = new boolean[n][m];

		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < m; j++) {
				if (str.charAt(j) == 'W') {
					arr[i][j] = true;
				} else {
					arr[i][j] = false;
				}
			}
		}
		// 8 x 8 일 때 부터 경우의 수가 유효하기 때문이다.
		int nRow = n - 7;
		int mCol = m - 7;
		for (int i = 0; i < nRow; i++) {
			for (int j = 0; j < mCol; j++) {
				chess(i, j);
			}
		}
		System.out.println(min);
	}

	private static void chess(int x, int y) {
		int endX = x + 8;
		int endY = y + 8;
		int cnt = 0;

		boolean fstColor = arr[x][y];
		// board check i, j로 시작
		for (int i = x; i < endX; i++) {
			for (int j = y; j < endY; j++) {
				if(arr[i][j] != fstColor) {
					cnt++;
				}
				fstColor = (!fstColor);
			}
			fstColor = (!fstColor);
			
		}

		cnt = Math.min(cnt, 64-cnt);
		
		min = Math.min(min, cnt);
	}

}

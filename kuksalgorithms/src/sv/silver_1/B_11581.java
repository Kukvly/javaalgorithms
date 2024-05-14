package sv.silver_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_11581 {

	static int n;
	static boolean arr[][];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine()); // 교차로 수

		arr = new boolean[n + 1][n + 1];

		for (int i = 1; i <= n - 1; i++) {
			int m = Integer.parseInt(br.readLine()); // 1번 교차로와 연결된 수
			String input[] = br.readLine().split(" ");
			for (int j = 0; j < m; j++) {
				int num = Integer.parseInt(input[j]);
				arr[i][num] = true;
			}

		}
		
		for (int k=1; k<n; k++) {
			for(int i=1; i<n; i++) {
				for(int j=1; j<n; j++) {
					if(arr[i][k] && arr[k][j]) {
						arr[i][j] = true;
					}
				}
			}
		}
		
		String rtn = "NO CYCLE";
		
		for (int i=1; i<n; i++) {
			if(arr[1][i] && arr[i][i]) {
				rtn = "CYCLE";
				break;
			}
		}
		
		System.out.println(rtn);

	}

}

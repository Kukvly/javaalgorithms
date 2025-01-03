package gd.gold_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_12865 {

	// 12865
	/**
	 * 
	 * @author kukvly <평범한 배낭>
	 * 
	 *         이 문제는 아주 평범한 배낭에 관한 문제이다. 물건의 개수: n 물건의 무게: w 가중치: v
	 * 
	 *         최대 무게: k
	 * 
	 *         가중치 합의 최댓값은?
	 * 
	 *         첫 줄에 물품의 수 n (1<=n<=100)와 버틸 수 있는 무게 k (1<=k<=100000) 두 번째 줄부터 n개의 줄에
	 *         걸쳐 각 물건의 무게 w (1<=w<=100000)와 해당 물건의 가치 v (0<=v<=1000)가 주어진다.
	 * 
	 *         물건 두개를 합쳤을 때의 무게 = 7
	 *
	 */

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]); // 물건 개수
		int k = Integer.parseInt(input[1]); // 무게

		int w[] = new int[n + 1]; // 무게
		int v[] = new int[n + 1]; // 가중치

		int dp[][] = new int[n + 1][k + 1]; // i에는 무게를 j에는 가중치를

		for (int i = 1; i <= n; i++) {
			input = br.readLine().split(" ");
			w[i] = Integer.parseInt(input[0]);
			v[i] = Integer.parseInt(input[1]);
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= k; j++) {
				if (w[i] <= j) {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w[i]] + v[i]);
				} else {
					dp[i][j] = dp[i - 1][j];
				}
			}
		}

		System.out.print(dp[n][k]);
	}

}